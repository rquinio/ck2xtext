package ck2xtext.generic.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import ck2xtext.tests.vanilla.VanillaTest;



/**
 * Check that vanilla files don't raise validation errors.
 * 
 * Split into multiple methods for easier failure reporting.
 */
@ExtendWith(InjectionExtension.class)
@InjectWith(Ck2InjectorProvider.class)
public class Ck2VanillaTest extends VanillaTest {

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

}
