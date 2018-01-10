package com.ipartek.formacion.ejercicios.paraprincipiantes;

/**
 * 	Programa java que declare cuatro variables enteras A, B, C y D
 *  y asígnale un valor a cada una. A continuación realiza las 
 * 	instrucciones necesarias para que:
 * 
 *		B tome el valor de C
 *		C tome el valor de A
 *		A tome el valor de D
 *		D tome el valor de B
 */

public class Ejercicio_004 {
	
	public static void main(String[] args) {
		
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int aux;
        
        System.out.println("Valores iniciales");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("Valores finales");
        System.out.println("b toma el valor de c -> b = " + b);
        System.out.println("c toma el valor de a -> c = " + c);
        System.out.println("a toma el valor de d -> a = " + a);
        System.out.println("d toma el valor de b -> d = " + d);
		
	}

}

