package ck2xtext.tests.vanilla;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;

import com.google.inject.Inject;

import ck2xtext.gfx.validation.Ck2GfxValidator;
import ck2xtext.tests.util.FileResourceHelper;

public abstract class VanillaTest {

	@Inject
	private FileResourceHelper resourceHelper;

	@Inject
	private ValidationTestHelper validationHelper;

	/**
	 * Check the file at given path trigger no validation errors.
	 * <p>
	 * Used for classpath resources validation.
	 */
	protected void validate(String path) {
		System.setProperty(Ck2GfxValidator.CK2_BASE_DIR, new File("src/ck2xtext/tests/vanilla").getAbsolutePath());
		try {
			validateTestResource("../../tests/vanilla/" + path);
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	/**
	 * eclipse-test-plugin resources can only be loaded as streams from classpath
	 */
	private void validateTestResource(String path) throws IOException {
		InputStream stream = this.getClass().getResourceAsStream(path);
		Resource resource = resourceHelper.resource(stream, path);
		validationHelper.assertNoIssues(resource);
	}
	
	/**
	 * Check the file triggers no validation errors.
	 * <p>
	 * Used for end-to-end validation
	 */
	protected void validate(File file) {
		try {
			validateVanillaResource(file);
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	private void validateVanillaResource(File file) throws IOException {
		Resource resource = resourceHelper.resource(file);
		validationHelper.assertNoIssues(resource);
	}
	
	protected static File[] getFiles(String path, String extension) {
		System.setProperty(Ck2GfxValidator.CK2_BASE_DIR, Ck2InstalledCondition.getInstallationPath());
		return getFiles(new File(Ck2InstalledCondition.getInstallationPath() + path), extension);
	}

	private static File[] getFiles(File file, String extension) {
		File[] files;
		if (file.isFile()) {
			files = new File[] { file };
		} else {
			files = file.listFiles((dir, name) -> name.toLowerCase().endsWith(extension));
		}
		return files;
	}
}
