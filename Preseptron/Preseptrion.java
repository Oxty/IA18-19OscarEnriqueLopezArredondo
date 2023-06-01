package logicaDifusa;

public class Preseptrion {

	public static void main(String[] args) {
		

		// Variables de entrada.
		double x1;
		double x2;
		
		// Variables de salida.
		double y1;
		double y2;
		double y3;
		
		// Pesos sinápticos.
		double w11 = 2.15; // Pesos de la neurona #1
		double w12 = -1.86;
		double o1 = 1.95; // Umbral #1
		
		double w21 = 0.82; // Pesos de la neurona #2
		double w22 = 1.21;
		double o2 = 1.34; // Umbral #2
		
		double w31 = -0.75; // Pesos de la neurona #3
		double w32 = 0.93;
		double o3 = -0.62; // Umbral #3
		
		
		// Desarrollo de operaciones para salidas
		
		// Entrada 1 en x1 y x2
		
		x1 = -1;
		x2 = -1;

		y1 = Math.tanh( (x1 * w11) + (x2 * w12) + (1 * o1) );
		y2 = Math.tanh( (x1 * w21) + (x2 * w22) + (1 * o2) );
		y3 = Math.tanh( (y1 * w31) + (y2 * w32) + (1 * o3) ); // Salida final
		System.out.println("Salida 1: " + y3);
		
		x1 = -1;
		x2 = 1;
		
		y1 = Math.tanh( (x1 * w11) + (x2 * w12) + (1 * o1) );
		y2 = Math.tanh( (x1 * w21) + (x2 * w22) + (1 * o2) );
		y3 = Math.tanh( (y1 * w31) + (y2 * w32) + (1 * o3) ); // Salida final
		System.out.println("Salida 2: " + y3);
		
		x1 = 1;
		x2 = -1;

		y1 = Math.tanh( (x1 * w11) + (x2 * w12) + (1 * o1) );
		y2 = Math.tanh( (x1 * w21) + (x2 * w22) + (1 * o2) );
		y3 = Math.tanh( (y1 * w31) + (y2 * w32) + (1 * o3) ); // Salida final
		System.out.println("Salida 3: " + y3);
		

		x1 = 1;
		x2 = 1;

		y1 = Math.tanh( (x1 * w11) + (x2 * w12) + (1 * o1) );
		y2 = Math.tanh( (x1 * w21) + (x2 * w22) + (1 * o2) );
		y3 = Math.tanh( (y1 * w31) + (y2 * w32) + (1 * o3) ); // Salida final
		System.out.println("Salida 4: " + y3);

	}
}
