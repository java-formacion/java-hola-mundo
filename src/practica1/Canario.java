package practica1;

public class Canario extends Ave{
	int tamano;
	
	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}

	public Canario(char sexo, int edad, int tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}
	
	void mostrarAltura() {
		if (tamano>30) {
			System.out.println("Alto");
		}else if(tamano>=15) {
			System.out.println("Mediano");
		}else {
			System.out.println("Bajo");
		}
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
}
