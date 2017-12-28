package ejercicios.secuenciales;
import java.util.*;
/**
 * 
 * @author java
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double longitudRadio;
		System.out.println("Cual es la longitud del radio en cm?");
		longitudRadio= sc.nextDouble();
		System.out.println("La longitud de la circunferencia es: "+(2*Math.PI*longitudRadio));
		System.out.println("El área es: "+Math.pow(Math.PI*longitudRadio, 2));
	}

}
