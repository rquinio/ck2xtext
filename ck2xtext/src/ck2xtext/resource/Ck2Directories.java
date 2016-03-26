package ck2xtext.resource;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import com.google.inject.Singleton;

@Singleton
public class Ck2Directories implements ICk2Directories {

	private static List<String> managedDirectories = new ArrayList<String>();

	static {
		managedDirectories.add("common/bookmarks");
		managedDirectories.add("common/buildings");
		managedDirectories.add("common/cb_types");
		managedDirectories.add("common/combat_tactics");
		managedDirectories.add("common/council_positions");
		managedDirectories.add("common/council_voting");
		managedDirectories.add("common/cultures");
		managedDirectories.add("common/disease");
		managedDirectories.add("common/dynasties");
		managedDirectories.add("common/event_modifiers");
		managedDirectories.add("common/government_flavor");
		managedDirectories.add("common/governments");
		managedDirectories.add("common/graphicalculturetypes");
		managedDirectories.add("common/job_actions");
		managedDirectories.add("common/job_titles");
		managedDirectories.add("common/landed_titles");
		managedDirectories.add("common/laws");
		managedDirectories.add("common/mercenaries");
		managedDirectories.add("common/minor_titles");
		managedDirectories.add("common/modifier_definitions");
		managedDirectories.add("common/nicknames");
		managedDirectories.add("common/objectives");
		managedDirectories.add("common/on_actions");
		managedDirectories.add("common/opinion_modifiers");
		managedDirectories.add("common/province_setup");
		managedDirectories.add("common/religion_modifiers");
		managedDirectories.add("common/religions");
		managedDirectories.add("common/religious_titles");
		managedDirectories.add("common/retinue_subunits");
		managedDirectories.add("common/scripted_effects");
		managedDirectories.add("common/scripted_triggers");
		managedDirectories.add("common/special_troops");
		managedDirectories.add("common/trade_routes");
		managedDirectories.add("common/traits");
		managedDirectories.add("common/triggered_modifiers");
		managedDirectories.add("common");

		managedDirectories.add("decisions");
		managedDirectories.add("events");
		managedDirectories.add("history/characters");
		managedDirectories.add("history/provinces");
		managedDirectories.add("history/technology");
		managedDirectories.add("history/titles");
		managedDirectories.add("history/wars");
		managedDirectories.add("interface");
		managedDirectories.add("map");
		managedDirectories.add("music");
	}

	@Override
	public boolean canHandle(URI uri) {
		String path = uri.path();
		if (path.contains("/")) {
			String dirPath = path.substring(0, path.lastIndexOf("/"));

			for (String directory : managedDirectories) {
				if (dirPath.endsWith(directory)) {
					return true;
				}
			}
		}
		return false;
	}

}
