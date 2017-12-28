package hola1;

	/** 
	* ejercicio para definir variables primitivas en java <br> 
	* vamos a declarar las más usadas
	* <ul>
	* 	<li>int</li>
	* 	<li>float</li>
	*   <li>char</li>
	* 	<li>boolean</li>
	*/


public class VariablesPrimitivas {

	 public static void main (String [] args) {
		 
		 System.out.println("variable numérica entera \"int\" tiene un rango de (" + Integer.MIN_VALUE + ","  + Integer.MAX_VALUE + " ) ");
		 int numeroAlumnos = 15;
	
		 float dineroEnBanco = 789.45f;
		 
		 char sexo = 'h'; /* h hombre , m mujer , i indeterminado*/
		 
		 boolean mayorDeEdad = true; 
		 
		 String numeroEscrito = "12";
		 int numero = Integer.parseInt(numeroEscrito);
	 }

}
