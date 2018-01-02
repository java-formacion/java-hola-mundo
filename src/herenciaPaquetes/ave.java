package herenciaPaquetes;

public class ave {

	public char sexo;
	public int edad;
	public static int numeroAves = 0;

	public ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		ave.numeroAves = numeroAves++;

	}

	public void quienSoy() {
		System.out.println("sexo: " + sexo + " edad: " + edad + "numero de aves: " + numeroAves);
	}

}
