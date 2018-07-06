package ck2xtext.tests.vanilla;

import java.io.File;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class Ck2InstalledCondition implements ExecutionCondition {

	private static String[] VANILLA_INSTALL_PATHS = { "C:/Program Files (x86)/Steam/SteamApps/common/Crusader Kings II/",
			"C:/Steam/SteamApps/common/Crusader Kings II/" };

	/**
	 * Disabled if vanilla CK2 installation cannot be located
	 */
	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		String path = getInstallationPath();
		if(path != null) {
			return ConditionEvaluationResult.enabled("CK2 installtion detected in " + path);
		}
		return ConditionEvaluationResult.disabled("No CK2 installation detected");
	}
	
	public static String getInstallationPath(){
		for (String path : VANILLA_INSTALL_PATHS) {
			if (new File(path).exists()) {
				return path;
			}
		}
		return null;
	}

}
