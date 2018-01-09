package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.util.*;

/**
 * 
 * Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, 
 * minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida. 
 * 
 * Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para 
 * las horas será mayor o igual que cero y menor que 24.
 * 
 * El valor válido para los minutos y 
 * segundos estará comprendido entre 0 y 59 ambos incluidos
 *
 */

public class Ejercicio_009 {

	public static void main(String[] args) {
		
        int h;
        int m;
        int s;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca hora: ");
        
        h =  sc.nextInt();
        
        System.out.print("Introduzca minutos: ");
        
        m =  sc.nextInt();
        
        System.out.print("Introduzca segundos: ");
        
        s =  sc.nextInt();
        
        if(h>=0 && h<24 && m>=0 && m<60 && s>=0 && s<60)     
           System.out.println("Hora correcta");
        else
            System.out.println("Hora incorrecta");
        
        sc.close();
        
        
	}
}
