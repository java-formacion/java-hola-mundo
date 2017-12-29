package ejercicios.condicional;

import java.util.Scanner;

/**
 * Programa java que lea un carácter por teclado y compruebe si es un dígito
 * numérico (cifra entre 0 y 9).
 * 
 * @author eritzinho
 *
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c1;
		System.out.println("Introduzca un caracter");
		c1=sc.next().charAt(0) ;
		if(c1>='0' && c1<='9') {
			System.out.println("Es un número");
		}else {
			System.out.println("Bien hecho, no es número");
		}

	}

}
