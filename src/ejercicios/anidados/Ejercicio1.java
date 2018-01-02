package ejercicios.anidados;
/**
 * Mostrar los números perfectos entre 1 y 1000.
 * @author eritzinho
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {		
		int i, j, suma;
		for(i=1; i<=1000; i++) {
			suma=0;
			for(j=1; j<i; j++) {
				
				if(i%j==0) {
					suma=suma+j;
				}
			}
			if(i==suma) {
				System.out.println("El número "+i+" es perfecto");
		}
		
		}
	}

}
