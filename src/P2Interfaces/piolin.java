package P2Interfaces;

public class piolin extends canario implements Hablador {

	public int numeroPeliculas;

	public piolin(int edad, String nombre, String canta, int numeroPeliculas) {
		super(edad, nombre, canta);
		this.numeroPeliculas = numeroPeliculas;
	}

	public void hablar() {

		System.out.println("Hola, soy un Piolin y sé hablar");
	}
	
	public void misDatos() {
		System.out.println("Mi nombre es: "+ nombre);
		System.out.println("Mi edad es: "+ edad);
		System.out.println("Canto: "+ canta);
		System.out.println("Número de Peliculcas "+ numeroPeliculas);
	}
}
