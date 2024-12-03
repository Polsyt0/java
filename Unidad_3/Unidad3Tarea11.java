package Unidad_3;

import java.util.Iterator;
import java.util.Scanner;

public class Unidad3Tarea11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número entero para ver su tabla de multiplicar: ");
		int numero = scanner.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
	}
}

	