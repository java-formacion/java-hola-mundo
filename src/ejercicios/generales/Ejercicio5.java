package ejercicios.generales;
import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n;
		int contadorDoses=0;
		System.out.println("introduce un número");
		
		do {
			n=sc.nextInt();
			if(n%10==2) {
				contadorDoses++;
			}
		}
		while(n>=0);
		System.out.println("Has introducido "+contadorDoses+" números que acaban en 2");
	}

}
