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
			
			System.out.println("introduce tama�o");
			tamano= sc.nextInt();
			
			//Llamar al m�todo quienSoy de las dos instancias
			//� Llamar al m�todo altura con la instancia del Piol�n
			//� Invocar al m�todo deDondeEres con la instancia del Loro
			//� Modificar el tama�o del Piol�n y volver a invocar al m�todo altura
			//� Modificar la regi�n del Loro
			//� Mostrar el n�mero de Aves creadas.
			
		

	}
}
