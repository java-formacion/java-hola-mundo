package com.ipartek.formacion.ejercicios.secuenciales;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int dia, mes, año;
	//cambio para probar commit and push
			System.out.println("introduce dia");
			int dia=leeCifra();
			System.out.println("introduce mes");
			int mes=leeCifra();
			System.out.println("introduce año");
			int año=leeCifra();
		
			sacarDecimales(dia, mes, año);
	}

	private static void sacarDecimales(int d, int m, int a) {
		// TODO Auto-generated method stub
		int suma=d+m+a;
		System.out.println(suma);
		System.out.println("separados:");
		System.out.println((int)(suma/1000));
		System.out.println((int)((suma%1000)/100));
		System.out.println((int)((suma%100)/10));
		System.out.println((int)(suma%10));
		int resultado=(int)(suma/1000)+(int)((suma%1000)/100)+(int)((suma%100)/10)+(int)(suma%10);
		System.out.println("resultado "+resultado);
	}

	private static int leeCifra() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println(numero);
		return numero;
	}

	
}
