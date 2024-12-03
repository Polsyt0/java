package unidad_2;

/**		Declara e inicializa las variables que necesites de manera que te permitan realizar las operaciones aritméticas básicas (suma, resta, multiplicación, división y el módulo de la división).

Pinta por consola la operación con su resultado. **/

public class Unidad2Tarea7 {

	public static void main(String[] args) {
		
		int num1 = 54;
		int num2 = 23;
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicación = num1 * num2;
		double division = (float)num1/num2; 
		int moduloDiv = num1%num2; 
		
		System.out.println("54 + 23 = " + suma);
		System.out.println("54 - 23 = " + resta);
		System.out.println("54 x 23 = " + multiplicación);
		System.out.println("54 / 23 = " + division);
		System.out.println("Resto = " + moduloDiv);
		
	}

}
