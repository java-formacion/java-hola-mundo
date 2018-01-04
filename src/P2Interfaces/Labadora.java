package P2Interfaces;

public class Labadora extends Aparato {

	public double ancho;
	public double alto;

	public Labadora(int consumo, double precio, double ancho, double alto) {
		super(consumo, precio);
		this.ancho = ancho;
		this.alto = alto;
	}

}
