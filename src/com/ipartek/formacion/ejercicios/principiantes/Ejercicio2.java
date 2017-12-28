package com.ipartek.formacion.ejercicios.principiantes;

/**
 *  Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, 
 *  dos variables N y M de tipo double y asigna a cada una un valor. 
 *  A continuación reliza y muestra muestra por pantalla una serie de operaciones entre ellas.
 *  La suma  X + Y
	La diferencia  X – Y
	El producto  X * Y
	El cociente  X / Y
	El resto  X % Y
	La suma  N + M
	La diferencia  N – M
	El producto  N * M
	El cociente  N / M
	El resto  N % M
	La suma X + N
	El cociente Y / M
	El resto Y % M
	El doble de cada variable
	La suma de todas las variables
	El producto de todas las variables
 * @author java
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int x = 8, y = 4;
		double n = 0.5, m = 20.5;
		
		System.out.println("Variable x = " + x);
		System.out.println("Variable y = " + y);
		System.out.println("Variable n = " + n);
		System.out.println("Variable m = " + m);
		
		System.out.println("-----------------");
		System.out.println("Variables x y");
		System.out.println(x + " + " + y + " = " + (x+y));
		System.out.println(x + " - " + y + " = " + (x-y));
		System.out.println(x + " * " + y + " = " + (x*y));
		System.out.println(x + " / " + y + " = " + (x/y));
		System.out.println(x + " % " + y + " = " + (x%y));
		
		System.out.println("-----------------");
		System.out.println("Variables  n m");
		
		System.out.println(n + " + " + m + " = " + (n+m));
		System.out.println(n + " - " + m + " = " + (n-m));
		System.out.println(n + " * " + m + " = " + (n*m));
		System.out.println(n + " / " + m + " = " + (n/m));
		System.out.println(n + " % " + m + " = " + (n%m));
		
		System.out.println("-----------------");
		System.out.println(x + " + " + n + " = " + (x+n));
        System.out.println(y + " / " + m + " = " + y/m);
        System.out.println(y + " % " + m + " = " + y%m);
        System.out.println("Variable X = " + x + " el doble es " + 2*x);
        System.out.println("Variable Y = " + y + " el doble es " + 2*y);
        System.out.println("Variable M = " + m + " el doble es " + 2*m);
        System.out.println("Variable N = " + n + " el doble es " + 2*n);
        
        System.out.println("La suma de todas las variables");
        System.out.println("-----------------");
        System.out.println(x + " + " + y + " + " + n + " + " + m + " = " + (x+y+n+m));
        
        System.out.println("El producto de todas las variables");
        System.out.println("-----------------");
        System.out.println(x + " * " + y + " * " + n + " * " + m + " = " + (x*y*m*n));

	}

}
