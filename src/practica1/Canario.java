package practica1;

public class Canario extends Ave{
	int tama�o;
	
	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}

	public Canario(char sexo, int edad, int tama�o) {
		super(sexo, edad);
		this.tama�o = tama�o;
	}
	
	void mostrarAltura() {
		if (tama�o>30) {
			System.out.println("Alto");
		}else if(tama�o>=15) {
			System.out.println("Mediano");
		}else {
			System.out.println("Bajo");
		}
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
}
