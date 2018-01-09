package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/**
 * 
 * Programa que lea una cantidad de grados cent�grados y la pase 
 * a grados Fahrenheit. La f�rmula correspondiente para pasar de 
 * grados cent�grados a fahrenheit es:
 * 
 * 	F = 32 + ( 9 * C / 5)
 *
 */

public class Ejercicio_004 {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      
	      double gC;
	      double gF;
	      
	      System.out.println("Introduce grados Cent�grados:");
	      
	      gC = sc.nextDouble();
	      
	      gF = 32 + (9 * gC / 5);
	      
	      System.out.println(gC +" �C = " + gF + " �F");
	      
	      sc.close();
	}
}
