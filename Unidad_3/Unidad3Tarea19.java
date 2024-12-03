package Unidad_3;

public class Unidad3Tarea19 {

    public static void main(String[] args) {

        int max = 9;

        for (int i = 0; i <= max; i++) {

            System.out.print("0");

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
              System.out.println();
        }

        for (int i = 0; i <= max; i++) {

            System.out.print("0");

            for (int j = 1; j <= i; j++) {

                System.out.print("-" + j);
            }
              System.out.println();
        }
        
    }
}
