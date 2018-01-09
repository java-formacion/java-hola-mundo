package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.io.*;
/**
 * 
 * Programa java que lea un carácter por teclado y compruebe si es 
 * un dígito numérico 
 * 
 * (cifra entre 0 y 9).
 *
 */

public class Ejercicio_006 {

	public static void main(String[] args) throws IOException {
		
        char car1;
        
        System.out.print("Introduzca carácter: ");
        
        car1 = (char)System.in.read(); //lee un carácter
        
        if(Character.isDigit(car1)) //utilizamos el método isDigit de la clase Character
           System.out.println("Es un número");
        else
           System.out.println("No es un número");
	}
}
