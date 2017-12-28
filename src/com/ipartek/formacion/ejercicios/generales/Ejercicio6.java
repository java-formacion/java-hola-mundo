package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa java para calcular si un número es perfecto:
 * @author java
 *
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1 
            if (n % i == 0) {
                suma = suma + i;     // si es divisor se suma
            }
        }
        if (suma == n) {  // si el numero es igual a la suma de sus divisores es perfecto
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }

	}

}
