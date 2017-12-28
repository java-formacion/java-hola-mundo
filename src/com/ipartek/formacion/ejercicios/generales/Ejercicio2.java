package com.ipartek.formacion.ejercicios.generales;

import java.io.IOException;
import java.util.Scanner;

/**
 * Calcular el n�mero de cifras de un n�mero entero
 * @author java
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int n, cifras;
        char car;
        do{
            System.out.print("Introduce un n�mero entero: ");
            n = sc.nextInt();
            cifras= 0;    //esta variable es el contador de cifras
            while(n!=0){             //mientras a n le queden cifras
                    n = n/10;         //le quitamos el �ltimo d�gito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El n�mero tiene " + cifras + " cifras");
            System.out.print("Continuar? ");
            car = (char)System.in.read();
        }while(car!='n' && car != 'N');    
    }

	}


