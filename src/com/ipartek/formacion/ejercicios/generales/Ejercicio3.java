package com.ipartek.formacion.ejercicios.generales;

import java.io.IOException;
import java.util.Scanner;

/**
 * Programa Java que lee una temperatura expresada en grados centígrados y la convierte a grados kelvin. 

	El proceso de leer grados centígrados se debe repetir mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
	
	Para hacer la conversión de grados Centígrados a grados Kelvin hay que utilizar la fórmula:
	
	ºK = ºC + 273
 * @author java
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        double temperatura;
        char car;
        
        do{
            System.out.print("Introduce temperatura en ºC: ");
            temperatura = sc.nextDouble();
            System.out.println("Grados Kelvin ..: " + (temperatura+273));
            System.out.print("Repetir proceso? (S/N): " );
            car = (char)System.in.read();
        }while(car =='S' || car == 's');

	}

}
