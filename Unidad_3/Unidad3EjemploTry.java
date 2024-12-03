package Unidad_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unidad3EjemploTry {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 1;
		do {
			try { } catch (InputMismatchException ex) {
				System.out.println("ERROR: Debe introducir numeros.");
				sc.next();
			} catch (ExceptionInInitializerError ex) {
				System.out.println("ERROR al inicializar");
			}
		} while (numero < 0);

		System.out.println("Fin");
	}

}
