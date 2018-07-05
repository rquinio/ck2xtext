package ck2xtext.generic.resource;

import org.eclipse.emf.common.util.URI;

import com.google.inject.ImplementedBy;

/**
 * Filters the files that are not in directories recognized by the game, as CK2 loading is directory-based.
 */
@ImplementedBy(Ck2Directories.class)
public interface ICk2Directories {

	boolean canHandle(URI uri);

}
