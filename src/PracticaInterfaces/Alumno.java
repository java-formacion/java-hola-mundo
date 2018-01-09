package PracticaInterfaces;

public class Alumno extends Persona implements Hablador{
	
	public String carrera;
	public int curso;
	
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public Alumno(int edad, String nombre, String carrera, int curso) {
		super(edad, nombre);
		this.carrera = carrera;
		this.curso = curso;
	}

	@Override
	public void Hablar() {
		System.out.println("hola soy un alumno y se hablar "+this.edad+this.nombre+this.carrera+this.curso);
		
	}
	
}
