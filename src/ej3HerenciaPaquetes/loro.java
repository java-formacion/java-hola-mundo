package ej3HerenciaPaquetes;

public class loro extends ave {
	private char region;
	public String color;

	public loro(String nombreAve, String nombreDueno, char sexo, int edad, char region, String color) {
		super(nombreAve, nombreDueno, sexo, edad);
		this.region = region;
		this.color = color;
	}

	
	public char getRegion() {
		return region;
	}


	public void setRegion(char region) {
		if (region!='N' && region!='S' && region!='E' && region!='O') {
			System.out.println("Región erronea, por defecto será del Norte");
			this.region ='N';}
		else	
		this.region = region;
	}


	public void cantar() {
		System.out.println("Piiio-piiiio loro bonito");
	}
	
	
	public void deDondeEres() {

		switch (region) {
		case 'N':
			System.out.println("REGION NORTE");
			break;
		case 'S':
			System.out.println("REGION SUR");
			break;
		case 'E':
			System.out.println("REGION ESTE");
			break;
		case 'O':
			System.out.println("REGION OESTE");
			break;
		default:
			System.out.println("la región introducida no es válida");
		}

	}
}