package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa Java que lea un nombre y muestre por pantalla:
	“Buenos dias nombre_introducido”
 * @author java
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce un nombre: ");
        cadena = sc.nextLine();
        System.out.println("Buenos Días " + cadena);

	}

}
