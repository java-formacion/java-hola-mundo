package PracticaInterfaces2;

import PracticaInterfaces.Hablador;

public class Radio extends Aparato implements Hablador{
	
	public char cassette;
	public int potencia;
	
	public char getCassette() {
		return cassette;
	}

	public void setCassette(char cassette) {
		this.cassette = cassette;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Radio(int consumo, int precio, char cassette, int potencia) {
		super(consumo, precio);
		this.cassette = cassette;
		this.potencia = potencia;
	}
	@Override
	public void Hablar() {
		System.out.println("Hola soy una radio y se hablar "+this.consumo+this.precio+this.cassette+this.potencia);
		
	}
}
