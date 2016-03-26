package ck2xtext.tests.resource;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.IResourceFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import ck2xtext.tests.Ck2InjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(Ck2InjectorProvider.class)
public class Ck2ResourceFactoryTest {

	@Inject
	IResourceFactory resourceFactory;

	@Test(expected = IllegalStateException.class)
	public void changeLogShouldNotBeHandled() {
		URI uri = URI.createFileURI("/ChangeLog.txt");

		resourceFactory.createResource(uri);
	}

	@Test
	public void landedTitlesShouldBeHandled() {
		URI uri = URI.createFileURI("/common/landed_titles/landed_titles.txt");

		Resource resource = resourceFactory.createResource(uri);

		assertNotNull(resource);
	}

}
