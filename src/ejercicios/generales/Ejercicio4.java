package ejercicios.generales;
import java.util.*;
/**
 * Programa Java que lea un n�mero entero N y muestre la tabla de multiplicar de ese n�mero. Por ejemplo, si se lee el valor 7 se mostrar� por pantalla:

 * @author eritzinho
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n;
		System.out.println("�De qu� n�mero quiere mostrar la tabal de multiplicaci�n?");
		n=sc.nextInt();
		System.out.println("La tabla de multiplicar del n�mero "+n+" es");
		for(int i=1; i<=10; i++) {			
			System.out.println(n*i);
		}
	}

}
