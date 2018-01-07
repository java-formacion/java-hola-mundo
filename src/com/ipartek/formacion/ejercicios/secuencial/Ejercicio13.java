package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
 * mes, año) y calcule su número de la suerte. El número de la suerte se calcula
 * sumando el día, mes y año de la fecha de nacimiento y a continuación sumando
 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
 * 12/07/1980 Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
 * 28 Número de la suerte: 28
 *
 */

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dia, mes, ano, suma, cifra1, cifra2, cifra3, cifra4, suerte;
		System.out.println("¡Calculemos tu numero de la suerte!");
		System.out.println("Empecemos por el año en que naciste:");
		ano = sc.nextInt();
		System.out.println("Ahora continuemos con el mes (numero de mes) en el que naciste");
		mes = sc.nextInt();
		System.out.println("Y por ultimo el dia en el que naciste:");
		dia = sc.nextInt();
		suma = dia + mes + ano;
		//System.out.println("Comprobacion");
		//suma=sc.nextInt();
		cifra1=suma/1000;
		cifra2=suma/100%10;
		cifra3=suma/10%10;
		cifra4=suma%10;
		suerte=cifra1+cifra2+cifra3+cifra4;
		System.out.println("Nuestros expertos astrologos, han calculado que tu numero de la suerte es el... \n"+suerte);
		

	}

}
