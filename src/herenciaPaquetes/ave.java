package herenciaPaquetes;

import java.util.Scanner;

/**
 * Tiene como atributos de instancia el sexo (M/H), la edad (entero) y como
atributo de clase el número de aves creadas, que se incrementa cada vez que
se crea un nuevo Ave
• Tiene como método el constructor que inicializa, con los parámetros que recibe,
los dos atributos de la clase.
• Además existe un método de clase que indica el número de Aves creadas
• Además tiene un método quienSoy que saca los valores de los dos atributos
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
