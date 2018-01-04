package P2Interfaces;

public class loro extends ave implements Hablador {

	public String region;
	public String color;

	public loro(int edad, String nombre, String region, String color) {
		super(edad, nombre);
		this.region = region;
		this.color = color;
	}

	public void hablar() {

		System.out.println("Hola, soy un Loro y sé hablar");
	}
	
	public void misDatos() {
		System.out.println("Mi nombre es: "+ nombre);
		System.out.println("Mi edad es: "+ edad);
		System.out.println("Mi región es: "+ region);
		System.out.println("Mi color es: "+ color);
	}
}