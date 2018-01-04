package ej3HerenciaPaquetes;

public abstract class ave{

	private char sexo;
	public int edad;
	private static int numeroAves;
	public datosPersonales nombres;
	
	
	public ave(String nombreAve, String nombreDueno, char sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		this.nombres = new datosPersonales(nombreAve, nombreDueno);
		numeroAves++;
	}

	

	public char getSexo(char sexo) {
		if(sexo!= 'H' && sexo!= 'H') {
			System.out.println("Sexo erroneo, por defecto será Macho");
			this.sexo = 'M';
		}
		else
			this.sexo = sexo;
		return sexo;		
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public static void numeroavescreadas() {

		System.out.println("numero de aves: " + numeroAves);
	}

	public void quienSoy() {
		System.out.println("sexo: " + sexo + " edad: " + edad);
	}

	
	abstract void cantar();
	
	
}
