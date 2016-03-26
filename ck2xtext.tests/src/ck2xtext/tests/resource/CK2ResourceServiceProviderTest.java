package ck2xtext.tests.resource;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import ck2xtext.tests.Ck2InjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(Ck2InjectorProvider.class)
public class CK2ResourceServiceProviderTest {

	@Inject
	IResourceServiceProvider provider;

	@Test
	public void changeLogShouldNotBeHandled() {
		URI uri = URI.createFileURI("/ChangeLog.txt");

		assertFalse(provider.canHandle(uri));
	}

	@Test
	public void landedTitlesShouldBeHandled() {
		URI uri = URI.createFileURI("/common/landed_titles/landed_titles.txt");

		assertTrue(provider.canHandle(uri));
	}

	@Test
	public void staticModifiersShouldBeHandled() {
		URI uri = URI.createFileURI("/common/static_modifiers.txt");

		assertTrue(provider.canHandle(uri));
	}

	@Test
	public void eventsShouldBeHandled() {
		URI uri = URI.createFileURI("/events/battle_events.txt");

		assertTrue(provider.canHandle(uri));
	}

	@Test
	public void badFolderNamesShouldNotBeHandled() {
		URI uri = URI.createFileURI("/event/battle_events.txt");

		assertFalse(provider.canHandle(uri));
	}
}
