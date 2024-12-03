package unidad_2;

/**Realizar un programa en Java que calcule el área del cuadrado y el del círculo. Mostrar los resultados por consola.

Área cuadrado = lado * lado = lado2

Área círculo = PI * r2**/

public class Unidad2Tarea6 {

	public static void main(String[] args) {
		
//    	Área del cuadrado
		
		double ladoCuadrado = 5;
		double areaCuadrado = Math.pow(ladoCuadrado, 2);
		
		System.out.println("Área del cuadrado = " +  areaCuadrado);
		
//		Área del circulo
		
		double radioCirculo = 8;
		double areaCirculo = Math.PI * (Math.pow(radioCirculo, 2));
		
		System.out.println(areaCirculo);
		
		
		
		
		
		

	}

}
