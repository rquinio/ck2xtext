package ck2xtext.tests.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit4.util.ResourceHelper;

public class FileResourceHelper extends ResourceHelper {

	public Resource resource(File file) throws IOException {
		InputStream stream = new FileInputStream(file);
		ResourceSet resourceSet = createResourceSet();
		Resource resource = resource(stream, computeUnusedUri(resourceSet), null, resourceSet);
		stream.close();
		return resource;
	}

	public Resource resource(InputStream stream) throws IOException {
		ResourceSet resourceSet = createResourceSet();
		Resource resource = resource(stream, computeUnusedUri(resourceSet), null, resourceSet);
		stream.close();
		return resource;
	}
}