package com.ipartek.formacion.ejercicios.paraprincipiantes;

/**
 * 	Escribe un programa Java que realice lo siguiente: 
 * 		Declarar dos variables X e Y de tipo int, dos variables N y M 
 * 		de tipo double y asigna a cada una un valor. 
 * 
 * 	A continuación muestra por pantalla:
 * 
 *	El valor de cada variable.
 *	La suma  X + Y
 *	La diferencia  X – Y
 *	El producto  X * Y
 *	El cociente  X / Y
 *	El resto  X % Y
 *	La suma  N + M
 *	La diferencia  N – M
 *	El producto  N * M
 *	El cociente  N / M
 *	El resto  N % M
 *	La suma X + N
 *	El cociente Y / M
 *	El resto Y % M
 *	El doble de cada variable
 *	La suma de todas las variables
 *	El producto de todas las variables
 *
 */

public class Ejercicio_002 {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        double m = 1.2;
        double n = 3.7;
        System.out.println("Variable x = " + x);
        System.out.println("Variable y = " + y);
        System.out.println("Variable m = " + m);
        System.out.println("Variable n = " + n);
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " * " + y + " = " + x*y);
        System.out.println(x + " / " + y + " = " + x/y);
        System.out.println(x + " % " + y + " = " + x%y);
        System.out.println(n + " + " + m + " = " + (n+m));
        System.out.println(n + " - " + m + " = " + (n-m));
        System.out.println(n + " * " + m + " = " + n*m);
        System.out.println(n + " / " + m + " = " + n/m);
        System.out.println(n + " % " + m + " = " + n%m);
        System.out.println(x + " + " + n + " = " + (x+n));
        System.out.println(y + " / " + m + " = " + y/m);
        System.out.println(y + " % " + m + " = " + y%m);
        System.out.println("Variable x = " + x + " el doble es " + 2*x);
        System.out.println("Variable y = " + y + " el doble es " + 2*y);
        System.out.println("Variable m = " + m + " el doble es " + 2*m);
        System.out.println("Variable n = " + n + " el doble es " + 2*n);
        System.out.println(x + " + " + y + " + " + n + " + " + m + " = " + (x+y+m+n));
        System.out.println(x + " * " + y + " * " + n + " * " + m + " = " + (x*y*m*n));
    }
}
