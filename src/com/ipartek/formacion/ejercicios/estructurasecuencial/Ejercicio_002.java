package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/**
 * Programa Java que lea un nombre y muestre por pantalla:
 * 
 * “Buenos dias nombre_introducido”
 *  
 */

public class Ejercicio_002 {
	
public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
    String nombre;
    
    System.out.println("Introduce un nombre: ");
    
    nombre = sc.nextLine();
    
    System.out.println("Buenos Días " + nombre);
    
    sc.close();
	
	}
}
