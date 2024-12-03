package Unidad_3;

import java.util.Scanner;

/*
 * Crear un método "formaDePago" que  tenga como parámetros de entrada un string con el nombre del cliente, y un entero con el número de artículos comprados. 
 * El método devolverá un String indicando la forma de pago (efectivo, cheque o tarjeta).

En el método se evaluará la cantidad de artículos comprados y según esto devolverá un string indicando como deberá pagar el cliente:

Si la cantidad es menor de 5 pagara en efectivo,
si es mayor de 5 y menor de 12 pagara con tarjeta, 
si es mayor de 13 pagara con cheque.
Crea una aplicación que recoja el nombre del cliente y la cantidad de artículos comprados por teclado (Utilizar la clase Scanner para recoger los datos). 
Dichos datos los utilizaremos para invocar al método y pintaremos por consola el nombre del cliente y la forma de pago.

Hacer esto hasta que el usuario no desee introducir más clientes. Para esto deberemos preguntar al usuario si desea continuar.

**En el mensaje debemos mostrar el nombre y la cantidad introducida y cómo se debe pagar.
 * */

public class Unidad3Tarea22 {

public static String formaDePago(String nombreCliente, int articulos) {
		
		if (articulos < 5) {
			return "debe pagar en efectivo";
		} else if (articulos >= 5 && articulos <= 12) {
			return "debe pagar con tarjeta";
		} else {
			return "debe pagar con cheque";
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner scString = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		
		String nombreCliente = "";
		int articulos = 0;
		int salir = 0;
		
		do {
			
			System.out.println("Introduzca el nombre del cliente:");
			nombreCliente = scString.nextLine();
			
			System.out.println("Introduzca la cantidad de articulos que ha comprado:");
			if (scInt.hasNextInt()) {
				articulos = scInt.nextInt();
				
				String mensaje = formaDePago(nombreCliente, articulos);
				System.out.println("El cliente " + nombreCliente + " ha comprado " + articulos + " articulos, " + mensaje);
				
				System.out.println("¿Desea continuar? \n"
						+ "1. Continuar \n"
						+ "2. Salir");
				
				if (scInt.hasNextInt()) {
					salir = scInt.nextInt();
				} else {
					System.out.println("Error: El valor introducido no es valido");
					scInt.next();
					break;
				}
			} else {
				System.out.println("Error: El valor introducido no es valido");
				scInt.next();
			}
			
		} while (salir != 2);
		
		System.out.println("El programa se ha cerrado correctamente");


	}

}
