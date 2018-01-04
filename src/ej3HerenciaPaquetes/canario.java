package ej3HerenciaPaquetes;

public class canario extends ave {

	private int tamano;

	public void cantar() {}
	
	public canario(String nombreAve, String nombreDueno, char sexo, int edad) {
		super(nombreAve, nombreDueno, sexo, edad);
	}

	public canario(String nombreAve, String nombreDueno, char sexo, int edad, int tamano) {
		super(nombreAve, nombreDueno, sexo, edad);
		this.tamano = tamano;
	}

	public void tamano() {
		if (tamano > 30)
			System.out.println(" ave alta");
		else if (15 > tamano)
			System.out.println(" ave baja");
		else
			System.out.println(" ave mediana");
	}

}