package com.ipartek.formacion.ejercicios.paraprincipiantes;

/**
 * Escribe un programa Java que declare una variable entera N y as�gnale un valor. 
 * 
 * 	A continuaci�n escribe las instrucciones que realicen los siguientes:
 * 
 *	Incrementar N en 77.
 *	Decrementarla en 3.
 *	Duplicar su valor.
 *
 */

public class Ejercicio_003 {
	
	public static void main(String[] args) {
		
        int N = 1;
        System.out.println("Valor inicial de N = " + N);
        N+=77;
        System.out.println("N + 77 = " + N);
        N-=3;
        System.out.println("N - 3 = " + N);
        N*=2;
        System.out.println("N * 2 = " + N);
        
	}
}
