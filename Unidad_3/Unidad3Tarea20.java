package Unidad_3;

import java.util.Scanner;

/*
 * Crear una aplicación que solicite una frase y muestre 
 * la primera palabra introducida, la última palabra introducida 
 * y cuente las veces que se repite una palabra.
 * 
** Puedes utilizar los métodos substring(), contains(), 
*indexOf(), lastIndexOf(), trim(), toLowerCase(), 
*length(),... de la clase String.
**/

public class Unidad3Tarea20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase de tu gusto:");
		String frase = sc.nextLine();

		if (frase.isEmpty()) {
			System.out.println("No se ha introducido ninguna frase");
			return;
		}
		;

		String primeraPalabra = "";
		int i = 0;
		while (i < frase.length() && frase.charAt(i) != ' ') {
			primeraPalabra += frase.charAt(i);
			i++;
		}
//        comienza a leer la ultima palabra con el -1 y la analiza y va añadiendo caracteres a la variable 
//        hasta que se encuentra con un espacio y se pone el charat y despues se suma a la variable para q lo escirba
//        en orden

		String ultimaPalabra = "";
		int j = frase.length() - 1;
		while (j >= 0 && frase.charAt(j) != ' ') {
			ultimaPalabra = frase.charAt(j) + ultimaPalabra;
			j--;
		}

		System.out.println("Primera palabra: " + primeraPalabra);
		System.out.println("Última palabra: " + ultimaPalabra);

		System.out.println("Introduce la palabra a buscar:");
		String palabraBuscar = sc.nextLine();
		int contador = 0;
		String palabraActual = "";

		for (int k = 0; k <= frase.length(); k++) {
			if (k < frase.length() && frase.charAt(k) != ' ') {
				palabraActual += frase.charAt(k);
			} else if (!palabraActual.isEmpty()) {
				if (palabraActual.equalsIgnoreCase(palabraBuscar)) {
					contador++;
				}
				palabraActual = "";
			}
		}
		System.out.println("La palabra " + palabraBuscar + " se repite " + contador + " veces.");

	}

}
