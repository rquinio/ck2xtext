package ck2xtext.ui.tests;

import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.*;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.ui.AbstractAutoEditTest;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import ck2xtext.ui.internal.Ck2xtextActivator;

@SuppressWarnings("restriction")
@RunWith(XtextRunner.class)
@InjectWith(Ck2UiInjectorProvider.class)
public class Ck2UiTest extends AbstractAutoEditTest {

	@Inject
	FileExtensionProvider extensionProvider;

	@Inject
	ProjectFactory projectFactory;

	private IProject project;

	private IFile file;

	@Before
	public void doSetUp() throws CoreException, InvocationTargetException, InterruptedException {
		project = createProject("myMod");
		file = createFile("common/landed_titles/my_titles.txt", "");
	}

	@After
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
