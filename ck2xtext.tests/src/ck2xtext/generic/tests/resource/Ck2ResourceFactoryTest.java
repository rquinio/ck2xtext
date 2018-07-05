package ck2xtext.generic.tests.resource;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

import ck2xtext.generic.tests.Ck2InjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(Ck2InjectorProvider.class)
public class Ck2ResourceFactoryTest {

	@Inject
	IResourceFactory resourceFactory;

	@Test
	public void changeLogShouldNotBeHandled() {
		URI uri = URI.createFileURI("/ChangeLog.txt");
		assertThrows(IllegalStateException.class, ()-> resourceFactory.createResource(uri));
	}

	@Test
	public void landedTitlesShouldBeHandled() {
		URI uri = URI.createFileURI("/common/landed_titles/landed_titles.txt");

		Resource resource = resourceFactory.createResource(uri);

		assertNotNull(resource);
	}

}
