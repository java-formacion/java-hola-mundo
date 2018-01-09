package PracticaInterfaces3;

import PracticaInterfaces.Hablador;

public class Piolin extends Canario implements Hablador{
	public int nPeliculas;
	
	public int getnPeliculas() {
		return nPeliculas;
	}

	public void setnPeliculas(int nPeliculas) {
		this.nPeliculas = nPeliculas;
	}

	public Piolin(char sexo, int edad, char canta, int nPeliculas) {
		super(sexo, edad, canta);
		this.nPeliculas = nPeliculas;
	}
	@Override
	public void Hablar() {
		System.out.println("Hola soy un piolin y se hablar "+this.sexo+this.edad+this.canta+this.nPeliculas);
	}
}
