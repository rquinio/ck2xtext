package ck2xtext.tests.vanilla;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import ck2xtext.tests.Ck2InjectorProvider;
import ck2xtext.tests.util.FileResourceHelper;

/**
 * Check that vanilla files don't raise validation errors.
 * 
 * Split into multiple methods for easier failure reporting.
 */
@RunWith(XtextRunner.class)
@InjectWith(Ck2InjectorProvider.class)
public class Ck2VanillaTest extends AbstractXtextTests {

	private static final String VANILLA_INSTALL_PATH = "C:/Program Files (x86)/Steam/SteamApps/common/Crusader Kings II/";

	@Inject
	private FileResourceHelper resourceHelper;

	@Inject
	private ValidationTestHelper validationHelper;

	private boolean useVanilaInstallPath = false;

	@Test
	public void validateTechnology() {
		validate("common/technology.txt");
	}

	@Test
	public void validateBookmarks() {
		validate("common/bookmarks/00_bookmarks.txt");
	}

	@Test
	public void validateBuildings() {
		validate("common/buildings/00_tradepost.txt");
	}

	@Test
	public void validateCbTypes() {
		validate("common/cb_types/00_cb_types.txt");
	}

	@Test
	public void validateCombatTactics() {
		validate("common/combat_tactics/00_combat_tactics.txt");
	}

	@Test
	public void validateCulture() {
		validate("common/cultures/00_cultures.txt");
	}

	@Test
	public void validateDynasties() {
		validate("common/dynasties/00_dynasties.txt");
	}

	@Test
	public void validateEventModifiers() {
		validate("common/event_modifiers/00_event_modifiers.txt");
	}

	@Test
	public void validateGraphicalculturetypes() {
		validate("common/graphicalculturetypes/00_graphicalculturetype.txt");
	}

	@Test
	public void validateLandedTitles() {
		validate("common/landed_titles/landed_titles.txt");
	}

	@Test
	public void validateLaws() {
		validate("common/laws/crown_laws.txt");
	}

	@Test
	public void validateNicknames() {
		validate("common/nicknames/00_nicknames.txt");
	}

	@Test
	public void validateOnActions() {
		validate("common/on_actions/00_on_actions.txt");
	}

	@Test
	public void validateReligion() {
		validate("common/religions/00_religions.txt");
	}

	@Test
	public void validateTradeRoutes() {
		validate("common/trade_routes/00_silk_route.txt");
	}

	@Test
	public void validateTraits() {
		validate("common/traits/01_traits.txt");
	}

	@Test
	public void validateTriggeredModifiers() {
		validate("common/triggered_modifiers/00_triggered_modifiers.txt");
	}

	@Test
	public void validateDecisions() {
		validate("decisions/councillor_decision.txt");
	}

	@Test
	public void validateEvents() {
		// Invalid identifiers starting with _
		// validate("events/ambition_events.txt");
		validate("events/civil_war_events.txt");
		validate("events/chronicle_events.txt");

	}

	@Test
	public void validateHistoryCharacters() {
		validate("history/characters/baloch.txt");
	}

	@Test
	public void validateHistoryProvinces() {
		validate("history/provinces/1 - Vestisland.txt");
	}

	@Test
	public void validateHistoryTechnology() {
		validate("history/technology/africa.txt");
	}

	@Test
	public void validateHistoryTitles() {
		validate("history/titles/e_byzantium.txt");
	}

	@Test
	public void validateInterfaceAlertsGfx() {
		validate("interface/alerts.gfx");
	}

	@Test
	public void validateInterfaceAlertsGui() {
		validate("interface/alerts.gui");
	}

	@Test
	public void validateMapGeographicalRegion() {
		validate("map/geographical_region.txt");
	}

	@Test
	public void validateMapDefault() {
		validate("map/default.map");
	}

	/**
	 * Check the file at given path trigger no validation errors.
	 */
	private void validate(String path) {
		try {
			if (useVanilaInstallPath) {
				validateVanillaResource(path);
			} else {
				validateTestResource(path);
			}
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
	 * Load from file system.
	 * 
	 * Supports scanning directory and validating all files.
	 */
	private void validateVanillaResource(String path) throws IOException {
		File[] files = getFiles(new File(VANILLA_INSTALL_PATH + path));
		for (File file : files) {
			Resource resource = resourceHelper.resource(file);
			validationHelper.assertNoIssues(resource);
		}

	}

	private File[] getFiles(File file) {
		File[] files;
		if (file.isFile()) {
			files = new File[] { file };
		} else {
			files = file.listFiles();
		}
		return files;
	}
}
