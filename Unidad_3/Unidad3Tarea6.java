package Unidad_3;

import java.util.Scanner;

public class Unidad3Tarea6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int contador = 0;
		int negativos = 0;
		String numNegativos = "";
		
		while(contador < 10) {
			System.out.println("Introduzca un numero:");
			int numero = sc.nextInt();
			contador ++;
			
			if (numero < 0 ) {
				negativos++;
				numNegativos = numNegativos + ", " + numero;
		}
		
		
		};
		System.out.println("Ha introducido " + negativos + " numeros negativos");	
		System.out.println("Los numeros negativos introducidos son:" +
				numNegativos.substring(1));
		
		sc.close();
	}
		
}
