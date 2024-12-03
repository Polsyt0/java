package Unidad_3;

import java.util.Scanner;

/**
 * 
 * @author Pablo Egea
 * 
 * Crea una aplicación que recoja el nombre del cliente y la cantidad de artículos comprados por teclado (Utilizar la clase Scanner para recoger los datos).

	Evaluar la cantidad de artículos comprados y según esto mostrar un mensaje indicando cómo deberá pagar el cliente:

	Si la cantidad es menor de 5 pagara en efectivo,
	si es mayor de 5 y menor de 12 pagara con tarjeta, 
	si es mayor de 13 pagara con cheque.
 **En el mensaje debemos mostrar el nombre y la cantidad introducida y cómo se debe pagar. 
 *  **/

public class Unidad3Tarea1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce la cantidad de artículos comprados:");
		int nArticulos = sc.nextInt();
		
		String metodoPago; 
		
		if (nArticulos < 5) {
			metodoPago = "en efectivo";		
		} else if (nArticulos >= 5 && nArticulos <= 12) {metodoPago = "Con tarjeta";
		} else {metodoPago = "con cheque";
				}
		
		System.out.println(nombre + " ha comprado " + nArticulos + " articulos y el método de pago debe ser: " + metodoPago );
		
		sc.close();
		
	}
	

}
