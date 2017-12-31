package ejercicios.generales;

import java.util.*;

/**
 * Programa Java que lee una temperatura expresada en grados cent�grados y la
 * convierte a grados kelvin. El proceso de leer grados cent�grados se debe
 * repetir mientras que se responda �S� a la pregunta: Repetir proceso? (S/N)
 * 
 * @author eritzinho
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grados, kelvin;
		char respuesta;
		do {
		System.out.println("�Qu� temperatura hace en grados centigrados?");
		grados = sc.nextInt();
		kelvin = grados + 273;
		System.out.println("Eso son " + kelvin + " grados Kelvin");
		System.out.println("Quieres comprobar otra temperatura? (S/N)");
		respuesta=sc.next().charAt(0);
		}
		while(respuesta=='S' || respuesta=='s');

	}

}
