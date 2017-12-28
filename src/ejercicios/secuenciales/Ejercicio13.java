package ejercicios.secuenciales;
import java.util.Scanner;
/**
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
 * @author java
 *
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dia, mes, ano, cifraTotal, primeraCifra, segundaCifra, terceraCifra, cuartaCifra;
		System.out.println("Cual es tu fecha de nacimiento?");
		System.out.println("Escribe el día");
		dia = sc.nextInt();
		System.out.println("Escribe el mes");
		mes= sc.nextInt();
		System.out.println("Escribe el año");
		ano=sc.nextInt();
		cifraTotal = dia+mes+ano;
		

	}

}
