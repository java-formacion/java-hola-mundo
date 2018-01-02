package herenciaPaquetes;

public class loro extends ave {
	public char region;
	public String color;

	public loro(char sexo, int edad) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}

	public void deDondeEres() {
		switch (region) {
		case 'N':
			System.out.println("REGION NORTE");

		case 'S':
			System.out.println("REGION SUR");

		case 'E':
			System.out.println("REGION ESTE");
		case 'O':
			System.out.println("REGION OESTE");
		}

	}
}