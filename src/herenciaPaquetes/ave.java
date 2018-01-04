package herenciaPaquetes;


public class ave {

	public char sexo;
	public int edad;
	public static int numeroAves;

	public ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		numeroAves++;

	}

	public static void numeroavescreadas() {

		System.out.println("numero de aves: " + numeroAves);
	}

	public void quienSoy() {
		System.out.println("sexo: " + sexo + " edad: " + edad);
	}

}
