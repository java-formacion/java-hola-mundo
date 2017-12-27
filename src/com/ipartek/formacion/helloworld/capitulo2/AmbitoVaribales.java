package com.ipartek.formacion.helloworld.capitulo2;

/**
 * Ejercicio para aprender el Ambito de las variables.<br>
 * Pueden ser de CLASE, METODO o BLOQUE CODIGO.<br>
 *
 * @author ur00
 *
 */
public class AmbitoVaribales {

	// accesible desde cualquier parte de esta Clase
	static int variableClaseGlobal = 89;

	public static void main(String[] args) {

		// accesible solo dentro de este metodo 'main'
		int variableMetodoLocal = 12;

		// packaged

		if (true) {

			int variableBloque = 9;

			// sacar por pantalla todas las variables
			System.out.println(variableBloque);
			System.out.println(variableMetodoLocal);
			System.out.println(variableClaseGlobal);

		}

		// sacar por pantalla todas las variables
		// no es visible "variableBloque"
		System.out.println(variableMetodoLocal);
		System.out.println(variableClaseGlobal);

	}

	void otroMetodo() {

		// no es visible "variableBloque"
		// no es visible "variableMetodoLocal"
		System.out.println(variableClaseGlobal);

	}

}
