package Unidad_3;

//Crear una aplicación para mostrar los números del 1 al 100 indicando si el número es par o impar.

public class Unidad3Tarea8 {

	public static void main(String[] args) {

		int num = 0;

		while (num < 100) {

			num++;

			if (num % 2 == 0) {
				System.out.println(num + " es par");
			} else {
				System.out.println(num + " es impar");
			}

		}
	}

}
