package Unidad_3;

import java.util.Scanner;

public class Unidad3Tarea2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int n1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println(n1 + " es mayor que " + n2);
		} else if (n2 > n1) {
			System.out.println(n2 + " es mayor que " + n1);
		} else System.out.println("Los numeros son iguales");
		
		sc.close();
	}

}
