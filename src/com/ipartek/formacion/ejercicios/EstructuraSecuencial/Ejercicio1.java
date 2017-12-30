package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 * @author mikel
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero entero:");
		a=sc.nextInt();
		System.out.println("Escribe otro numero entero: ");
		b= sc.nextInt();
		System.out.println("Los numeros que has escrito son los siguientes: "+a+" y "+b);

	}

}
