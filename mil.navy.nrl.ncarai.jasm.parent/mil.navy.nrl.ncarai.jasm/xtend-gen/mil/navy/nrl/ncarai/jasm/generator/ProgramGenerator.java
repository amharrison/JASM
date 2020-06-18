/**
 * generated by Xtext 2.19.0
 */
package mil.navy.nrl.ncarai.jasm.generator;

import com.google.common.collect.Iterators;
import java.util.Collection;
import javax.inject.Inject;
import javax.inject.Provider;
import mil.navy.nrl.ncarai.jasm.jactrio2.IModelBuilder;
import mil.navy.nrl.ncarai.jasm.program.PackageDef;
import mil.navy.nrl.ncarai.jasm.program.Program;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.jactr.io2.jactr.modelFragment.ModelFragment;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ProgramGenerator extends AbstractGenerator {
  @Inject
  private IModelBuilder _modelBuilder;
  
  @Inject
  private Provider<ResourceSet> _resourceSetProvider;
  
  @Inject
  public IResourceValidator _validator;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      String name = (((PackageDef[])Conversions.unwrapArray(IteratorExtensions.<PackageDef>toIterable(Iterators.<PackageDef>filter(resource.getAllContents(), PackageDef.class)), PackageDef.class))[0]).getName();
      final Collection<ModelFragment> modelFragments = this._modelBuilder.build(((Program[])Conversions.unwrapArray(IteratorExtensions.<Program>toIterable(Iterators.<Program>filter(resource.getAllContents(), Program.class)), Program.class))[0]);
      final ModelFragment firstFragment = ((ModelFragment[])Conversions.unwrapArray(modelFragments, ModelFragment.class))[0];
      modelFragments.remove(firstFragment);
      String loaderPath = firstFragment.getPackage().getName().replace(".", "/");
      String loaderTmpPath = loaderPath;
      loaderTmpPath = (loaderTmpPath + ".generated");
      final URI loaderURI = fsa.getURI((loaderTmpPath + ".jactr"));
      Resource newResource = this._resourceSetProvider.get().createResource(loaderURI);
      newResource.getContents().add(firstFragment);
      newResource.save(null);
      fsa.generateFile((loaderPath + ".jactr"), fsa.readTextFile((loaderTmpPath + ".jactr")));
      fsa.deleteFile((loaderTmpPath + ".jactr"));
      for (final ModelFragment modelFragment : modelFragments) {
        {
          name = modelFragment.getPackage().getName();
          name = name.replace(".", "/");
          URI newURI = fsa.getURI((name + ".jactr"));
          newResource = this._resourceSetProvider.get().createResource(newURI);
          newResource.getContents().add(modelFragment);
          fsa.generateFile((name + ".jactr"), "");
          newResource.save(null);
        }
      }
      final IWorkspace workspace = ResourcesPlugin.getWorkspace();
      final String path = fsa.getURI((loaderPath + ".jactr")).toPlatformString(true);
      IWorkspaceRoot _root = workspace.getRoot();
      Path _path = new Path(path);
      final IFile file = _root.getFile(_path);
      final ICoreRunnable _function = (IProgressMonitor monitor) -> {
        NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
        file.touch(_nullProgressMonitor);
      };
      final Job job = Job.create("touch", _function);
      job.schedule(500);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}