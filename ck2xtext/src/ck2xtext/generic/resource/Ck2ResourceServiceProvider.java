package ck2xtext.generic.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider;

import com.google.inject.Inject;

/**
 * Filters the files that are not in directories recognized by the game, as CK2 loading is directory-based.
 *
 */
public class Ck2ResourceServiceProvider extends DefaultResourceServiceProvider {

	@Inject
	private ICk2Directories ck2Directories;

	@Override
	public boolean canHandle(URI uri) {
		if (ck2Directories.canHandle(uri)) {
			return super.canHandle(uri);
		}
		return false;
	}
}
