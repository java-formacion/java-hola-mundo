package herenciaPaquetes;

import java.util.Scanner;

/**
 * Tiene como atributos de instancia el sexo (M/H), la edad (entero) y como
atributo de clase el n�mero de aves creadas, que se incrementa cada vez que
se crea un nuevo Ave
� Tiene como m�todo el constructor que inicializa, con los par�metros que recibe,
los dos atributos de la clase.
� Adem�s existe un m�todo de clase que indica el n�mero de Aves creadas
� Adem�s tiene un m�todo quienSoy que saca los valores de los dos atributos
por pantalla
 */
public class ave {

	public void ave (int edad, String sexo) {
	
		
		System.out.println("introduzca el sexo del Ave (M/H");
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduzca edad del Ave (M/H");
		edad = sc.nextInt();
		
	}
		
	
	
	
	public static void main(String[] args) {
		String  sexo;
		int edad;

	
		
		
	}

}
