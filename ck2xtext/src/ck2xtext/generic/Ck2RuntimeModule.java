/*
 * generated by Xtext 2.9.1
 */
package ck2xtext.generic;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import ck2xtext.common.conversion.Ck2ValueConverterService;
import ck2xtext.generic.AbstractCk2RuntimeModule;
import ck2xtext.generic.formatting.Ck2Formatter;
import ck2xtext.generic.resource.Ck2ResourceFactory;
import ck2xtext.generic.resource.Ck2ResourceServiceProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class Ck2RuntimeModule extends AbstractCk2RuntimeModule {

	/**
	 * Override {@link org.eclipse.xtext.common.services.DefaultTerminalConverters}
	 */
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return Ck2ValueConverterService.class;
	}

	/**
	 * Override {@link org.eclipse.xtext.formatting.impl.OneWhitespaceFormatter}
	 */
	@Override
	public Class<? extends IFormatter> bindIFormatter() {
		return Ck2Formatter.class;
	}

	/**
	 * Override the @ImplementedBy in {@link IResourceServiceProvider}
	 */
	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return Ck2ResourceServiceProvider.class;
	}

	@Override
	public Class<? extends IResourceFactory> bindIResourceFactory() {
		return Ck2ResourceFactory.class;
	}
}
