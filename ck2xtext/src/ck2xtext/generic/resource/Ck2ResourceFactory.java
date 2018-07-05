package ck2xtext.generic.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Ck2ResourceFactory extends XtextResourceFactory {

	@Inject
	private ICk2Directories ck2Directories;

	@Inject
	public Ck2ResourceFactory(Provider<XtextResource> resourceProvider) {
		super(resourceProvider);
	}

	@Override
	public Resource createResource(URI uri) {
		if (ck2Directories.canHandle(uri)) {
			return super.createResource(uri);
		}

		throw new IllegalStateException(String.format(
				"The file %s cannot be edited with CK2 Editor, because it is not inside any of the recognized modding folders.",
				uri.lastSegment()));
	}

}
