package ejercicios.secuenciales;

import java.util.*;

/**
 * 
 * @author java
 *
 */
public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int primerCateto,segundoCateto;
		System.out.println("Introduce la longitud en cm de un cateto");
		primerCateto= sc.nextInt();
		System.out.println("Introduce la longitud en cm de un cateto");
		segundoCateto=sc.nextInt();
		System.out.println("La longitud de la hipotenusa es: "+Math.sqrt(Math.pow(primerCateto, 2)+Math.pow(segundoCateto, 2))+" cm");
		
	}
}
