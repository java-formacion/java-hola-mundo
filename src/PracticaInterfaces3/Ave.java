package PracticaInterfaces3;

public class Ave {
	public char sexo;
	public int edad;
	
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

	public Ave(char sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
	}	
}
