package com.ipartek.formacion.ejercicios.paraprincipiantes;

/**
 * 
 * Escribe un programa Java que realice lo siguiente: declarar una variable N 
 * de tipo int, una variable A de tipo double y una variable C de tipo char y 
 * asigna a cada una un valor. 
 * 
 * 	A continuación muestra por pantalla:
 * 
 *		El valor de cada variable.
 *		La suma de N + A
 *		La diferencia de A - N
 *
 */

public class Ejercicio_001 {

    public static void main(String[] args) {
        int n = 10;
        double a = 5.36;
        char c = 'a';
        System.out.println("Variable n = " + n);
        System.out.println("Variable a = " + a);
        System.out.println("Variable c = " + c);
        System.out.println(n + " + " + a + " = " + (n+a));
        System.out.println(a + " - " + n + " = " + (a-n));
        System.out.println("Valor numérico del carácter " + c + " = " + (int)c);
    }
}
