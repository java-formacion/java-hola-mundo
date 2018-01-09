package PracticaInterfaces3;

import PracticaInterfaces.Hablador;

public class Loro extends Ave implements Hablador{
	public char region;
	public String color;
	
	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}
	@Override
	public void Hablar() {
		System.out.println("Hola soy un loro y se hablar "+this.sexo+this.edad+this.region+this.color);
		
	}
}
