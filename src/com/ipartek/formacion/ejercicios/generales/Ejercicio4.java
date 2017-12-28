package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa Java que lea un n�mero entero N y muestre la tabla de multiplicar de ese n�mero. 
 * Por ejemplo, si se lee el valor 7 se mostrar� por pantalla:

	Tabla del 7
	--------------
	7 * 1  =  7
	7 * 2  = 14
	7 * 3  = 21
	7 * 4  = 28
	7 * 5  = 35
	7 * 6  = 42
	7 * 7  = 49
	7 * 8  = 56
	7 * 9  = 63
	7 * 10 = 70
 * @author java
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un n�mero entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        System.out.println("--------------");
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }

	}

}
