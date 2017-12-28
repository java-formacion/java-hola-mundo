package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Vamos a escribir un programa Java 
 * que pida por teclado un n�mero entero N de m�s de una cifra y verifique si es capic�a.
 * @author java
 *
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		int n, aux, inverso = 0, cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un n�mero >= 10: ");
            n = sc.nextInt();
        } while (n < 10);
       
        //le damos la vuelta al n�mero
        aux = n;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(n == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }

	}

}
