/*
 * generated by Xtext 2.23.0
 */
package fr.n7.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.PDL1RuntimeModule;
import fr.n7.PDL1StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class PDL1IdeSetup extends PDL1StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new PDL1RuntimeModule(), new PDL1IdeModule()));
	}
	
}
