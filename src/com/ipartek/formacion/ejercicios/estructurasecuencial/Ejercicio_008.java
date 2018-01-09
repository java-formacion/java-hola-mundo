package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/**
 * SIN RESOLVER
 * 
 * Programa que tome como dato de entrada un n�mero que corresponde 
 * a la longitud del radio una esfera y nos calcula y escribe el volumen 
 * de la esfera que se corresponden con dicho radio.
 * 
 * La f�rmula para calcular el volumen de la esfera es:
 *  v = (4/3)*PI*r^3
 */

public class Ejercicio_008 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        double radio;
        
        System.out.print("Introduzca radio de la esfera: ");
        
        radio = sc.nextDouble();
        
        System.out.println("Volumen de la esfera de radio " + radio + " = " + (4.0/3)* Math.PI * Math.pow(radio, 3));
        
        sc.close();
	}
}
