package PracticaInterfaces2;

import PracticaInterfaces.Hablador;

public class TV extends Aparato implements Hablador{

	public char teletexto;
	public int antiguedad;
	
	public char getTeletexto() {
		return teletexto;
	}

	public void setTeletexto(char teletexto) {
		this.teletexto = teletexto;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public TV(int consumo, int precio, char teletexto, int antiguedad) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}
	@Override
	public void Hablar() {
		System.out.println("Hola soy una TV y se hablar "+this.consumo+this.precio+this.teletexto+this.antiguedad);
		
	}
}
