package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.io.*;
/**
 * 
 * Programa java que lea un car�cter por teclado y compruebe si es 
 * un d�gito num�rico 
 * 
 * (cifra entre 0 y 9).
 *
 */

public class Ejercicio_006 {

	public static void main(String[] args) throws IOException {
		
        char car1;
        
        System.out.print("Introduzca car�cter: ");
        
        car1 = (char)System.in.read(); //lee un car�cter
        
        if(Character.isDigit(car1)) //utilizamos el m�todo isDigit de la clase Character
           System.out.println("Es un n�mero");
        else
           System.out.println("No es un n�mero");
	}
}
