/*
 * generated by Xtext 2.9.1
 */
package ck2xtext.ui.tests;

import ck2xtext.ui.internal.Ck2xtextActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class Ck2UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Ck2xtextActivator.getInstance().getInjector("ck2xtext.Ck2");
	}

}
