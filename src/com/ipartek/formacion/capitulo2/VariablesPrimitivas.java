package com.ipartek.formacion.capitulo2;

/**
 * Ejercicio para definir variables primitivas en Java <br>
 * Vamos a declarar solo las mas usadas <br>
 * 
 * 
 * <ul>
 * <li>int</li>
 * <li>float</li>
 * <li>char</li>
 * <li>boolean</li>
 * </ul>
 * 
 * 
 * @author Eder
 *
 */
public class VariablesPrimitivas {

	public static void main(String[] args) {

		System.out.println("variable numerica entero \"int\" tiene un rango(" + Integer.MIN_VALUE + ", "
				+ Integer.MAX_VALUE + ")");
		int numeroAlumnos = 15;

		float dineroEnBanco = 789.45f;

		char sexo = 'h'; // h hombre, m mujer, i indeterminado

		boolean mayorEdad = true;
		
		
		String numeroEscrito = "12";
		
		int numero = Integer.parseInt(numeroEscrito);

	}

}
