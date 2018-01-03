package practica1;

public class Ave {
	private char sexo;
	private int edad;
	private static int numeroDeAves;
	private DatosPersonales nombres;

	public Ave(char sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		avesCreadas();
	}

	public DatosPersonales getNombres() {
		return nombres;
	}

	public void setNombres(DatosPersonales nombres) {
		this.nombres = nombres;
	}

	static void avesCreadas() {
		numeroDeAves++;
	}

	void quienSoy() {
		System.out.println("Sexo: " + sexo + " edad: " + edad);
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getNumAves() {
		return numeroDeAves;
	}

	public void setNumAves(int numeroDeAves) {
		this.numeroDeAves = numeroDeAves;
	}
}
