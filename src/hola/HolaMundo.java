package hola;

import java.util.Scanner;

public class HolaMundo {
	
	public static void main(String[]args)
	{
		seleccion();
		//String opcionMenu= sc.nextLine();
		Idioma();
		/*System.out.println("mete nombre: ");
		String nombre = sc.nextLine();
		
		//String nombre = "ander";
		System.out.println("ongi etorri "+nombre);*/
	}
	
	private static void seleccion() {
		System.out.println("Selecciona idioma:");
		System.out.println("1.Castellano");
		System.out.println("2.Euskera");
		System.out.println("3.Ingles");
		System.out.println("introduce numero: ");
	}
	
	public static void Idioma () {
		
		Scanner sc = new Scanner(System.in);
		String opcionMenu = sc.nextLine();
		switch (opcionMenu) {
		case "1": 
		System.out.println("mete nombre: ");
		String nombre = sc.nextLine();
		System.out.println("mete apellido: ");
		String apellido = sc.nextLine();
		System.out.println("bienvenido "+nombre+" "+apellido);
		break;
		case "2": 
		System.out.println("zartu isena: ");
		String nombre1 = sc.nextLine();
		System.out.println("sartu abisena: ");
		String apellido1 = sc.nextLine();
		System.out.println("ongi etorri "+nombre1+" "+apellido1);
		break;
		case "3": 
		System.out.println("name: ");
		String nombre2 = sc.nextLine();
		System.out.println("surname: ");
		String apellido2 = sc.nextLine();
		System.out.println("Hello "+nombre2+" "+apellido2);
		break;
		}
	}
	
}
