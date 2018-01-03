package practica1;

public class Ave {
	char sexo;
	int edad;
	static int numeroDeAves;
	public Ave(char sexo, int edad) {
		super();		
		this.sexo = sexo;
		this.edad = edad;
		avesCreadas();
	}
	static void avesCreadas(){
		numeroDeAves++;
	}
	void quienSoy(){
		System.out.println("Sexo: "+ sexo + " edad: "+ edad);
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
}
