package herenciaPaquetes;


public class loro extends ave {
	public char region;
	public String color;

	public loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
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