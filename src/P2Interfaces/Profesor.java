package P2Interfaces;

public class Profesor extends Persona implements Hablador{
	
	public String despacho;
	public String email;
	public Profesor(int edad, String nombre, String despacho, String email) {
		super(edad, nombre);
		this.despacho = despacho;
		this.email = email;
	}
	
public void hablar () {
		
		System.out.println("Hola, soy un Profesor y sé hablar");
	}

public void misDatos() {
	System.out.println("Mi nombre es: "+ nombre);
	System.out.println("Mi edad es: "+ edad);
	System.out.println("Mi despacho es "+ despacho);
	System.out.println("Mi email es "+ email);
}

}
