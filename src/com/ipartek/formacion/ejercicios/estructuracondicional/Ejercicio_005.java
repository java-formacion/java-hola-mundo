package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.io.*;

/**
 * 
 * @author java
 *
 */

public class Ejercicio_005 {

	public static void main(String[] args) throws IOException {
		
        char car1;
        char car2;
        
        System.out.println("Introduzca primer car�cter: ");
        
        car1 = (char)System.in.read(); //lee un car�cter
        
        System.out.println("Introduzca segundo car�cter: ");
        
        car2 = (char)System.in.read(); //lee el segundo car�cter    
        
        if(car1>='a' && car1<='z'){
            if(car2>='a' && car2<='z')
               System.out.println("Los dos son letras min�sculas");
           else
               System.out.println("El primero es una letra min�scula pero el segundo no");
        }
        else{
            if(car2>='a' && car2<='z')
               System.out.println("El segundo es una letra min�scula pero el primero no");
           else
               System.out.println("Ninguno es una letra min�scula");
        }
}
}


