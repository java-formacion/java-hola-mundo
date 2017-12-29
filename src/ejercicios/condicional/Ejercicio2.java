package ejercicios.condicional;
import java.util.Scanner;
/**
 * Programa que lea un número entero y muestre si el número es múltiplo de 10.
 * @author eritzinho
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num;
		System.out.println("Introduce un número entero");
		num=sc.nextInt();
		if(num%10==0) {
			System.out.println("El número es múltiplo de 10");
		}
		else {
			System.out.println("El número no es múltiplo de 10");
		}

	}

}
