package ck2xtext.gfx.tests;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import ck2xtext.tests.vanilla.Ck2InstalledCondition;
import ck2xtext.tests.vanilla.VanillaTest;

@ExtendWith(Ck2InstalledCondition.class)
@ExtendWith(InjectionExtension.class)
@InjectWith(Ck2GfxInjectorProvider.class)
public class Ck2GfxFullVanillaTest extends VanillaTest {

	@Disabled
	@ParameterizedTest
	@MethodSource("allGfx")
	public void validateInterface(File file) throws IOException {
		validate(file);
	}
	
	static Stream<File> allGfx() {
		return Arrays.stream(VanillaTest.getFiles("interface", ".gfx"));
	}
}