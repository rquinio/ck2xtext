package ck2xtext.ui.tests;

import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.ui.AbstractAutoEditTest;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
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
	PluginProjectFactory projectFactory;

	@Before
	public void doSetUp() throws CoreException {
		createPluginProject("foo");
	}

	@After
	public void tearDown() throws Exception {
	};

	@Test
	public void test() throws Exception {
		XtextEditor editor = openEditor("Hello!");
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

	protected IProject createPluginProject(String name) throws CoreException {
		projectFactory.setProjectName(name);
		projectFactory.addFolders(Collections.singletonList("src"));
		projectFactory.addBuilderIds();
		projectFactory.addProjectNatures();
		IProject result = projectFactory.createProject(new NullProgressMonitor(), null);
		return result;
	}
}
