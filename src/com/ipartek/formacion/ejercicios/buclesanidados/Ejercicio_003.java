package com.ipartek.formacion.ejercicios.buclesanidados;

/**
 * Mostrar las letras del abecedario (sin la �) en may�sculas y en orden inverso. 
 * A continuaci�n en cada fila mostrar una letra menos hasta llegar a mostrar solamente la A.
 */

public class Ejercicio_003 {

	public static void main(String[] args) {
		
        for (char x = 'Z'; x >= 'A'; x--) {
            for (char y = x; y >= 'A'; y--) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}