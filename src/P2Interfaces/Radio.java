package P2Interfaces;

public class Radio extends Aparato implements Hablador {

	public String casette;
	public int potencia;

	public Radio(int consumo, double precio, String casette, int potencia) {
		super(consumo, precio);
		this.casette = casette;
		this.potencia = potencia;
	}

	public void hablar() {

		System.out.println("Hola, soy una Radio y sé hablar");
	}
	
	public void misDatos() {
		System.out.println("Mi consumo es: "+ consumo);
		System.out.println("Mi precio es: "+ precio+ " €");
		System.out.println("Tengo casette "+ casette);
		System.out.println("Mi potencia es "+ potencia +" W");
	}
}
