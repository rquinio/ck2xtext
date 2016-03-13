package ck2xtext.tests.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit4.util.ResourceHelper;
import org.eclipse.xtext.resource.XtextResource;

/**
 * Load a CK2 file as a Resource
 */
public class FileResourceHelper extends ResourceHelper {

	public Resource resource(File file) throws IOException {
		InputStream stream = new FileInputStream(file);
		return resource(stream);
	}

	public Resource resource(InputStream stream) throws IOException {
		ResourceSet resourceSet = createResourceSet();

		// CK2 files are encoded with windows-1252 (ANSI) encoding
		Map<String, String> options = new HashMap<String, String>();
		options.put(XtextResource.OPTION_ENCODING, "windows-1252");

		Resource resource = resource(stream, computeUnusedUri(resourceSet), options, resourceSet);
		stream.close();
		return resource;
	}
}