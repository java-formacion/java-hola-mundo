package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.util.Scanner;

/**
 *  Programa Java que lea dos n�meros enteros por teclado y los muestre por pantalla.
 * @author java
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		//declaraci�n de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        //leer el primer n�mero 
        System.out.println("Introduce un n�mero entero: "); 
        n1 = sc.nextInt();      //lee un entero por teclado
        //leer el segundo n�mero
        System.out.println("Introduce otro n�mero entero: "); 
        n2 = sc.nextInt();      //lee un entero por teclado
        //mostrar resultado
        System.out.println("Ha introducido los n�meros: " + n1 + " y " + n2);

	}

}
