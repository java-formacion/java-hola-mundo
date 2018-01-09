package PracticaInterfaces2;

public class Aparato {
	public int consumo;
	public int precio;
	
	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Aparato(int consumo, int precio) {
		super();
		this.consumo = consumo;
		this.precio = precio;
	}
		
}
