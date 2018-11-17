package ck2xtext.generic.tests;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import ck2xtext.tests.vanilla.Ck2InstalledCondition;
import ck2xtext.tests.vanilla.VanillaTest;

@ExtendWith(Ck2InstalledCondition.class)
@ExtendWith(InjectionExtension.class)
@InjectWith(Ck2InjectorProvider.class)
public class Ck2FullVanillaTest extends VanillaTest {

	static Stream<File> validateEvents() {
		return Arrays.stream(VanillaTest.getFiles("events", ".txt"));
	}

	static Stream<File> validateDecisions() {
		return Arrays.stream(VanillaTest.getFiles("decisions", ".txt"));
	}

	static Stream<File> validateAlternateStart() {
		return Arrays.stream(VanillaTest.getFiles("common/alternate_start", ".txt"));
	}

	static Stream<File> validateBloodlines() {
		return Arrays.stream(VanillaTest.getFiles("common/bloodlines", ".txt"));
	}

	static Stream<File> validateTraits() {
		return Arrays.stream(VanillaTest.getFiles("common/traits", ".txt"));
	}

	static Stream<File> validateReligionFeatures() {
		return Arrays.stream(VanillaTest.getFiles("common/religion_features", ".txt"));
	}

	static Stream<File> validateSocieties() {
		return Arrays.stream(VanillaTest.getFiles("common/societies", ".txt"));
	}

	static Stream<File> validateInterfaceGfx() {
		return Arrays.stream(VanillaTest.getFiles("interface", ".gfx"));
	}

	static Stream<File> validatePortraits() {
		return Arrays.stream(VanillaTest.getFiles("interface/portraits", ".gfx"));
	}

	static Stream<File> validateInterfaceGui() {
		return Arrays.stream(VanillaTest.getFiles("interface", ".gui"));
	}

	@ParameterizedTest
	@MethodSource
	public void validateEvents(File file) throws IOException {
		validate(file);
	}

	@ParameterizedTest
	@MethodSource
	public void validateDecisions(File file) throws IOException {
		validate(file);
	}

	@ParameterizedTest
	@MethodSource
	public void validateAlternateStart(File file) throws IOException {
		validate(file);
	}

	@ParameterizedTest
	@MethodSource
	public void validateBloodlines(File file) throws IOException {
		validate(file);
	}

	@ParameterizedTest
	@MethodSource
	public void validateTraits(File file) throws IOException {
		validate(file);
	}

	@ParameterizedTest
	@MethodSource
	public void validateSocieties(File file) throws IOException {
		validate(file);
	}

	@ParameterizedTest
	@MethodSource
	public void validateReligionFeatures(File file) throws IOException {
		validate(file);
	}

	@ParameterizedTest
	@MethodSource
	public void validateInterfaceGfx(File file) throws IOException {
		validate(file);
	}

	@ParameterizedTest
	@MethodSource
	public void validatePortraits(File file) throws IOException {
		validate(file);
	}

	@ParameterizedTest
	@MethodSource
	public void validateInterfaceGui(File file) throws IOException {
		validate(file);
	}
}
