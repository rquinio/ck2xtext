/*
 * generated by Xtext 2.9.1
 */
package ck2xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class Ck2UiModule extends AbstractCk2UiModule {

	public Ck2UiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	/**
	 * Disable Xtext nature popup
	 */
	@Override
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return IXtextEditorCallback.NullImpl.class;
	}
}
