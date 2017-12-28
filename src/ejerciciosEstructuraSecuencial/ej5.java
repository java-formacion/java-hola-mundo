package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 *  Programa que lee por teclado el valor del radio de una circunferencia 
 *  calcula y muestra por pantalla la longitud y el área de la circunferencia. 
 *  Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2

 */
public class ej5 {

	public static void main(String[] args) {
		double r;
		double l;
		double a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduce el radio de la circunferencia");
		r = sc.nextFloat();
		l = 2*Math.PI*r;
		//a= Math.PI*r*r;
		// otra forma más correcta sería --> a= Math.PI*Math.pow(r, 2); POR LO QUE LO DEJAMOS ASÍ
		a= Math.PI*Math.pow(r, 2);
		System.out.println("con una circunferencia de radio: " +r+ " la longitud es igual a: "+l+" y el área. "+a);

	}

}
