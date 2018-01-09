package PracticaInterfaces3;

public class Canario extends Ave{
	public char canta;
	
	public char getCanta() {
		return canta;
	}

	public void setCanta(char canta) {
		this.canta = canta;
	}

	public Canario(char sexo, int edad, char canta) {
		super(sexo, edad);
		this.canta = canta;
	}
}
