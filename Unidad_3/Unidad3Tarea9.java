package Unidad_3;

import java.util.Scanner;

/**
 * Crear una aplicación que muestre el perímetro de un circulo.
 * 
 * Perímetro Círculo = 2 * PI * radio
 * 
 * Para esto:
 * 
 * - 1º Lo primero que tendrás que hacer es solicitar al usuario un número para
 * saber radio. (scanner) - 2º El número recogido debe ser mayor que 0. Si el
 * número introducido por el usuario es menor o igual que cero volver a
 * solicitarlo hasta que el usuario introduzca un número válido. - 3º Hacer el
 * cálculo. - 4º Mostrar el resultado.
 **/

public class Unidad3Tarea9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int radio = 0;

		System.out.println("Introduzca el radio de su circulo:");
		radio = sc.nextInt();

		while (radio < 0) {
			System.out.println("Introduzca un número mayor a 0");
			radio = sc.nextInt();
		}

		System.out.println("El radio del circulo es:" + radio * 2 * Math.PI);

		sc.close();

	}

}
