package PracticaInterfaces2;

public class Labadora extends Aparato{
	public int alto;
	public int ancho;
	
	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public Labadora(int consumo, int precio, int alto, int ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}
}
