package PracticaInterfaces3;

public class Buitre extends Ave{
	public double velocidad;
	public double peso;
	
	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Buitre(char sexo, int edad, double velocidad, double peso) {
		super(sexo, edad);
		this.velocidad = velocidad;
		this.peso = peso;
	}
}
