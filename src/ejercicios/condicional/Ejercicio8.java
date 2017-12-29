package ejercicios.condicional;
import java.util.Scanner;
/**
 * Calcular el mayor de tres números enteros en Java.
 * @author eritzinho
 *
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Introduce un número");
		n1=sc.nextInt();
		System.out.println("Introduce otro número");
		n2=sc.nextInt();
		System.out.println("Introduce un último número");
		n3=sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println("n1 es el mayor");
		}else if(n2>n1 && n2>n3) {
			System.out.println("n2 es el mayor");
		}else if(n3>n1 && n3>n2) {
			System.out.println("n3 es el mayor");
		}else {
			System.out.println("Cortocircuito");
		}

	}

}
