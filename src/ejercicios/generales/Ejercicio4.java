package ejercicios.generales;
import java.util.*;
/**
 * Programa Java que lea un número entero N y muestre la tabla de multiplicar de ese número. Por ejemplo, si se lee el valor 7 se mostrará por pantalla:

 * @author eritzinho
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n;
		System.out.println("¿De qué número quiere mostrar la tabal de multiplicación?");
		n=sc.nextInt();
		System.out.println("La tabla de multiplicar del número "+n+" es");
		for(int i=1; i<=10; i++) {			
			System.out.println(n*i);
		}
	}

}
