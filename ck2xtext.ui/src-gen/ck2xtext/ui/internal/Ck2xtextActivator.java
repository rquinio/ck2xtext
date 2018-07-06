/*
 * generated by Xtext 2.14.0
 */
package ck2xtext.ui.internal;

import ck2xtext.common.Ck2TerminalsRuntimeModule;
import ck2xtext.common.ui.Ck2TerminalsUiModule;
import ck2xtext.generic.Ck2RuntimeModule;
import ck2xtext.generic.ui.Ck2UiModule;
import ck2xtext.gfx.Ck2GfxRuntimeModule;
import ck2xtext.gfx.ui.Ck2GfxUiModule;
import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Ck2xtextActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "ck2xtext.ui";
	public static final String CK2XTEXT_COMMON_CK2TERMINALS = "ck2xtext.common.Ck2Terminals";
	public static final String CK2XTEXT_GFX_CK2GFX = "ck2xtext.gfx.Ck2Gfx";
	public static final String CK2XTEXT_GENERIC_CK2 = "ck2xtext.generic.Ck2";
	
	private static final Logger logger = Logger.getLogger(Ck2xtextActivator.class);
	
	private static Ck2xtextActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static Ck2xtextActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			com.google.inject.Module runtimeModule = getRuntimeModule(language);
			com.google.inject.Module sharedStateModule = getSharedStateModule();
			com.google.inject.Module uiModule = getUiModule(language);
			com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected com.google.inject.Module getRuntimeModule(String grammar) {
		if (CK2XTEXT_COMMON_CK2TERMINALS.equals(grammar)) {
			return new Ck2TerminalsRuntimeModule();
		}
		if (CK2XTEXT_GFX_CK2GFX.equals(grammar)) {
			return new Ck2GfxRuntimeModule();
		}
		if (CK2XTEXT_GENERIC_CK2.equals(grammar)) {
			return new Ck2RuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getUiModule(String grammar) {
		if (CK2XTEXT_COMMON_CK2TERMINALS.equals(grammar)) {
			return new Ck2TerminalsUiModule(this);
		}
		if (CK2XTEXT_GFX_CK2GFX.equals(grammar)) {
			return new Ck2GfxUiModule(this);
		}
		if (CK2XTEXT_GENERIC_CK2.equals(grammar)) {
			return new Ck2UiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
	
}
