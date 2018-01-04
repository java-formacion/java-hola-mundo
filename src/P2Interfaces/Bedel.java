package P2Interfaces;

public class Bedel extends Persona implements Hablador {

	public String turno;
	public String antiguedad;

	public Bedel(int edad, String nombre, String turno, String antiguedad) {
		super(edad, nombre);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}

	public void hablar() {

		System.out.println("Hola, soy un Bedel y sé hablar");
	}
	
	public void misDatos() {
		System.out.println("Mi nombre es: "+ nombre);
		System.out.println("Mi edad es: "+ edad);
		System.out.println("Mi turno es "+ turno);
		System.out.println("Mi antigüedad es "+ antiguedad);
	}
}
