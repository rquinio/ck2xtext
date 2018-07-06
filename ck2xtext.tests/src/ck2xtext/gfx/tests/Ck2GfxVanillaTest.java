package ck2xtext.gfx.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import ck2xtext.tests.vanilla.VanillaTest;

@ExtendWith(InjectionExtension.class)
@InjectWith(Ck2GfxInjectorProvider.class)
public class Ck2GfxVanillaTest extends VanillaTest {

	@Test
	public void validateInterfaceAlertsGfx() {
		validate("interface/alerts.gfx");
	}
}
