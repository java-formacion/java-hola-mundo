package P2Interfaces;

public class TV extends Aparato implements Hablador {

	public String teletexto;
	public int antiguedad;

	public TV(int consumo, double precio, String teletexto, int antiguedad) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}

	public void hablar() {

		System.out.println("Hola, soy una TV y sé hablar");
	}
	
	public void misDatos() {
		System.out.println("Mi consumo es: "+ consumo);
		System.out.println("Mi precio es: "+ precio+ " €");
		System.out.println("Tengo teletexto "+ teletexto);
		System.out.println("Mi antigüedad es "+ antiguedad +" años");
	}
}
