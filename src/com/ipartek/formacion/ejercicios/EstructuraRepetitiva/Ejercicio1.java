package com.ipartek.formacion.ejercicios.EstructuraRepetitiva;

/**
 * Se trata de mostrar los números desde el 1 hasta el 100 utilizando las instrucciones repetitivas 
 * while, do while y for.
 * @author mikel
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//uno();
		//dos();
		//tres();
		//unoAlreves();
		//dosAlreves();
		tresAlreves();

	}

	private static void tresAlreves() {
		int a=100;
		while (a>0) {
			System.out.println(a);
			a--;
		}
		
	}

	private static void dosAlreves() {
		int a=100;
		do {
			System.out.println(a);
			a--;
		} while (a>0);
		
	}

	private static void unoAlreves() {
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		
	}

	private static void tres() {
		int a=1;
		while(a<=100) {
			System.out.println(a);
			a++;
		}
		
	}

	private static void dos() {
		int a=1;
		do {
			System.out.println(a);
			a++;
		} while (a<=100);
		
	}

	private static void uno() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
	}

}
