package ck2xtext.ui.tests;

import static org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil.*;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.testing.AbstractAutoEditTest;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

import ck2xtext.ui.internal.Ck2xtextActivator;

@ExtendWith(InjectionExtension.class)
@InjectWith(Ck2UiInjectorProvider.class)
public class Ck2UiTest extends AbstractAutoEditTest {

	@Inject
	FileExtensionProvider extensionProvider;

	@Inject
	ProjectFactory projectFactory;

	private IProject project;

	private IFile file;

	@BeforeEach
	public void doSetUp() throws CoreException, InvocationTargetException, InterruptedException {
		project = createProject("myMod");
		file = createFile("common/landed_titles/my_titles.txt", "");
	}

	@AfterEach
	public void tearDown() throws Exception {
	};

	@Test
	public void test() throws Exception {
		XtextEditor editor = openEditor(file);
		pressKey(editor, '\n');
		pressKey(editor, '\n');
		pressKey(editor, '\n');
		editor.close(false);
	}

	@Override
	protected String getEditorId() {
		return Ck2xtextActivator.CK2XTEXT_CK2;
	}

	@Override
	protected String getFileExtension() {
		return "txt";
	}
}
