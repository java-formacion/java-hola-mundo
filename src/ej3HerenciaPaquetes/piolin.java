package ej3HerenciaPaquetes;

//import java.util.Scanner;

public class piolin extends canario {

	public int numeroPeliculas;

	public piolin(String nombreAve, String nombreDueno, char sexo, int edad, int numeroPeliculas) {
		super(nombreAve, nombreDueno, sexo, edad);
		this.numeroPeliculas = numeroPeliculas;
	}
	
	
	public void cantar() {
		System.out.println("Pio-pio soy un Piolín");
	}
	
	
	public static void main(String Args[]) {
		//int edad;
		//char sexo;
		//int tamano;
		//String s;

		piolin p = new piolin("Perico", "Judit", 'M', 3, 20);

		piolin p2 = new piolin("Lola", "Pepa", 'H', 3, 20);

		piolin p3 = new piolin("Bat", "Joseba", 'M', 3, 20);

		p.nombres.setNombreDueno("Judith");
		p.nombres.setNombreAve("Pericco");

		loro l = new loro("Pipi", "David", 'M', 2, 'N', "Amarillo");

		System.out.println("el monbre del dueño es: "+ p.nombres.getNombreDueno());
		System.out.println("el monbre del Ave es: " + p.nombres.getNombreAve());
		
		//numeroavescreadas();
		p.cantar();
		l.cantar();
	}
}
