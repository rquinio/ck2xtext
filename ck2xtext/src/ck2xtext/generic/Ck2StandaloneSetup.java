/*
 * generated by Xtext 2.9.1
 */
package ck2xtext.generic;

import ck2xtext.generic.Ck2StandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Ck2StandaloneSetup extends Ck2StandaloneSetupGenerated {

	public static void doSetup() {
		new Ck2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}				
}