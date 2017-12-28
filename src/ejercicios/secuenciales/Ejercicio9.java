package ejercicios.secuenciales;
import java.util.*;
/**
 * Programa Java que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c), según la siguiente fórmula: Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p =  (a+b+c)/2
 * @author java
 *
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double a,b,c,p;
		System.out.println("De que longitud es el primer lado");
		a= sc.nextDouble();
		System.out.println("De que longitud es el segundo lado");
		b= sc.nextDouble();
		System.out.println("De que longitud es el tercer lado");
		c= sc.nextDouble();
		p=(a+b+c)/2;
		System.out.println("El área del triángulo es "+Math.sqrt(p*(p-a)*(p-b)*(p-c)) +" cm");

	}

}
