/*
 * generated by Xtext 2.23.0
 */
package fr.n7.ui.tests;

import com.google.inject.Injector;
import fr.n7.pdl2.ui.internal.Pdl2Activator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class PDL2UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Pdl2Activator.getInstance().getInjector("fr.n7.PDL2");
	}

}
