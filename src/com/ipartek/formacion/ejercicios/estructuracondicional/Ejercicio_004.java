package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.io.*;

/**
 * Programa que lea dos caracteres y compruebe si son iguales.
 */

public class Ejercicio_004 {
	
	public static void main(String[] args) throws IOException {
		
        char car1;
        char car2;
        
        System.out.print("Introduzca primer carácter: ");
        
        car1 = (char)System.in.read(); //lee un carácter
        
        System.in.read();  //saltar el intro que ha quedado en el buffer
        
        System.out.print("Introduzca segundo carácter: ");
        
        car2 = (char)System.in.read(); //lee el segundo carácter
        
        Character c1 = new Character(car1);
        
        Character c2 = new Character(car2);
        
        if(c1.equals(c2))  //comparamos dos objetos Character mediante el método equals
            System.out.println("Son iguales");   
        
        else
            System.out.println("No son iguales");
	}
}
