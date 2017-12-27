package com.ipartek.formacion.helloworld.capitulo2;

/**
 * Ejercicio para definir vairables primitivas en Java <br>
 * Vamos a declarar solo las mas usadas: <br>
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
 * @author ur00
 *
 */
public class VariablesPrimitivas {

	public static void main(String[] args) {

		System.out.println("variable numerica entera \"int\" tiene un rango(" + Integer.MIN_VALUE + ", "
				+ Integer.MAX_VALUE + ")");
		int numeroAlumnos = 15;

		float dineroEnBanco = (float) 789.45;
		double dineroBarcenas = 6231671643.90;

		char sexo = 'h'; // h hombre, m mujer, i indeterminado

		boolean mayorEdad = true;

		String numeroEscrito = "12";

		int numero = Integer.parseInt(numeroEscrito);

		String sNumero = "" + numero;

	}

}
