package P2Interfaces;

public class Alumno extends Persona implements Hablador {

	public String carrera;
	public String curso;

	public Alumno(int edad, String nombre, String carrera, String curso) {
		super(edad, nombre);
		this.carrera = carrera;
		this.curso = curso;
	}

	public void hablar() {

		System.out.println("Hola, soy un Alumno y sé hablar");
	}
	
	public void misDatos() {
		System.out.println("Mi nombre es: "+ nombre);
		System.out.println("Mi edad es: "+ edad);
		System.out.println("He estudiado "+ carrera);
		System.out.println("Mi curso es "+ curso);
	}
	
	
}
