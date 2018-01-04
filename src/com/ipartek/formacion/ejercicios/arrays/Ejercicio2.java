package com.ipartek.formacion.ejercicios.arrays;

import java.util.Scanner;

/**
 * Programa Java que lea 10 n�meros enteros por teclado y los guarde en un array. 
 * Calcula y muestra la media de los n�meros que est�n en las posiciones pares del array.
 * @author java
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        double media = 0;
        
      //lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        
      //Recorrer el array y calcular la media
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){ //si la posici�n actual es par
                media = media + numeros[i]; //se suma el valor de esa posici�n 
            }
        }
        //Calcular y mostrar la media
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);

	}

}
