package herenciaPaquetes;

import java.util.Scanner;

public class piolin extends canario {

	public int numeroPeliculas;

	public piolin(char sexo, int edad, int numeroPeliculas) {
		super(sexo, edad);
		this.numeroPeliculas = numeroPeliculas;
	}

	public static void main(String Args[]) {
		int edad;
		char sexo;
		int tamano;		
		String s;
		
			Scanner sc= new Scanner(System.in);
			
			System.out.println("introduce edad");
			edad= sc.nextInt();
			
			System.out.println("introduce sexo");
			s= sc.nextLine();
			sexo = s.charAt(0);
			
			System.out.println("introduce tamaño");
			tamano= sc.nextInt();
			
			//Llamar al método quienSoy de las dos instancias
			//• Llamar al método altura con la instancia del Piolín
			//• Invocar al método deDondeEres con la instancia del Loro
			//• Modificar el tamaño del Piolín y volver a invocar al método altura
			//• Modificar la región del Loro
			//• Mostrar el número de Aves creadas.
			
		

	}
}
