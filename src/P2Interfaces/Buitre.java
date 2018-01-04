package P2Interfaces;

public class Buitre extends ave {
	public int velocidadVuelo;
	public int peso;

	public Buitre(int edad, String nombre, int velocidadVuelo, int peso) {
		super(edad, nombre);
		this.velocidadVuelo = velocidadVuelo;
		this.peso = peso;
	}

}
