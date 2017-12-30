package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 * @author mikel
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int c;
		int f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime los grados centigrados");
		c=sc.nextInt();
		f=32+(9* c / 5);
		System.out.println(c+" centigrados son "+f+" Fahrenheit");

	}

}
