package Unidad_3;

import java.util.Scanner;

public class Unidad3Tarea11_mejorada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        String continuar = "s";

        do {
            do {
                System.out.print("Introduzca un número positivo:");
                
                if (sc.hasNextInt()) {
                    numero = sc.nextInt();
                    if (numero < 0) {
                        System.out.println("ERROR: SÓLO SE ACEPTAN NÚMEROS MAYORES O IGUALES A CERO");
                    }
                } else {
                    String error = sc.next();
                    System.out.println("ERROR: SÓLO SE ACEPTAN NÚMEROS ENTEROS: " + error);
                }
            } while (numero < 0);

            System.out.println("LA TABLA DE MULTIPLICAR DEL " + numero);

            for (int i = 0; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }

            System.out.print("¿Desea introducir otro número? (s/n): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s"));

        sc.close();
    }
}



