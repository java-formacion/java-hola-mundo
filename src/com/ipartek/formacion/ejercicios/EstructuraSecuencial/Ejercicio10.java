package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que lee un número de 3 cifras y muestra sus cifras por separado.
 * @author mikel
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero de tres cifras: ");
		Integer numero=sc.nextInt();
		 char[] nums = numero.toString().toCharArray();
	        for(char c: nums) {
	            System.out.print(c + " ");
	        }   
	     sc.close();
	}

}
