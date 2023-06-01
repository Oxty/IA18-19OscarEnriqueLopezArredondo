package com.myFuzzyProject;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;

public class TippingClass {
	public static void main(String[] args) throws Exception {
		String filename = "Refresco.fcl";
		FIS fis = FIS.load(filename, true);

		if (fis == null) {
			System.err.println("no carga el archivo: '" + filename + "'");
			System.exit(1);
		}

		// Get default function block
		FunctionBlock fb = fis.getFunctionBlock(null);

		// Set inputs
		fb.setVariable("temperaturaActual", 8.5);
		fb.setVariable("temperaturaDeseada", 7.5);

		// Evaluate
		fb.evaluate();

		// Show output variable's chart
		fb.getVariable("enfriamientoRequerido").defuzzify();

		// Print ruleSet
		System.out.println(fb);
		System.out.println("enfriamientoRequerido: " + fb.getVariable("enfriamientoRequerido").getValue());

	}

}
