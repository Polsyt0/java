package unidad_2;
/**
 * 
 * @author Pablo
 * @version beta_2.1
 * 
 */
public class Unidad2Ejemplo1 {

	public static void main(String[] args) {
		
//Esto es un ejemplo de comentario, ctrl+7 escribe directamente las dos barras
		
		/*Y con esto puedo escribir
		 * varias lineas y se cierra solo 
		 * al darle al enter
		 */

		System.out.println(Math.min(82003430,7492550));
	
//Declaración de variable para almacenar los dias de vacaciones
		
		int nDiasVacaciones; 
		
//inicializacion o asignamos un valor a la variable nDiasVacaciones
		
	    nDiasVacaciones = 30; 
	    
	    System.out.println("Numero de Dias de Vacaciones = " + nDiasVacaciones);
	    
//Para pintar el valor de la variable en consola hay que darle un valor antes
	    
	    int nFaltas = 10; 
	    
//La variable se puede declarar e inicializar a la misa vez
	    
	    System.out.println("Numero de Faltas = " + nFaltas);
	    
//si aparece la palabra final se convierte en constante por lo que el valor no cambia
//las constantes se escriben en mayusculas
	    
//Declaramos una constante
	    
	    final int TOTAL_VACACIONES = 45; 
	    
	    System.out.println("Dias totales de vacaciones = " + TOTAL_VACACIONES);
	    
	    System.out.println(Math.PI);
	    
	   
	}

}
