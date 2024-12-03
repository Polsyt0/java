package Unidad_3;

import java.util.Scanner;
import java.util.Random;

public class Unidad3Tarea21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = random.nextInt(100) + 1;
        boolean adivinado = false;
        
        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He generado un número aleatorio entre 1 y 100.");
        System.out.println("Intenta adivinarlo o escribe 'salir' para rendirte.");

        while (!adivinado) {
            System.out.print("Ingresa tu adivinanza: ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Te rendiste. El número era: " + numeroAleatorio);
                break;
            }
            
            try {
                int adivinanza = Integer.parseInt(entrada);
                
                if (adivinanza < 1 || adivinanza > 100) {
                    System.out.println("Por favor, ingresa un número entre 1 y 100.");
                } else if (adivinanza < numeroAleatorio) {
                    System.out.println("Demasiado bajo. Intenta nuevamente.");
                } else if (adivinanza > numeroAleatorio) {
                    System.out.println("Demasiado alto. Intenta nuevamente.");
                } else {
                    System.out.println("¡Felicidades! Adivinaste el número: " + numeroAleatorio);
                    adivinado = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número o 'salir'.");
            }
        }

        System.out.println("Gracias por jugar. ¡Hasta luego!");
        scanner.close();
    }
}

