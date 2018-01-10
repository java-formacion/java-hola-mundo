package com.ipartek.formacion.ejercicios.generales;
import java.util.*;

/**
 * 
 * En esta entrada vamos a escribir el programa java para convertir un número de decimal a binario.
 *
 */

public class Ejercicio_009 {

	public static void main(String[] args) {
		
        int numero;
        int exp;
        int digito;
        
        double binario;
        
        Scanner sc = new Scanner(System.in);

        do{  
            System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();
        }while(numero<0);

        exp=0;
        
        binario=0;
        
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
        
        sc.close();
    }
}
