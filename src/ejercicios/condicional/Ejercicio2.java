package ejercicios.condicional;
import java.util.Scanner;
/**
 * Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
 * @author eritzinho
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num;
		System.out.println("Introduce un n�mero entero");
		num=sc.nextInt();
		if(num%10==0) {
			System.out.println("El n�mero es m�ltiplo de 10");
		}
		else {
			System.out.println("El n�mero no es m�ltiplo de 10");
		}

	}

}
