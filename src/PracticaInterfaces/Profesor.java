package PracticaInterfaces;

public class Profesor extends Persona implements Hablador{
	
	public int despacho;
	public String mail;

	public int getDespacho() {
		return despacho;
	}

	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Profesor(int edad, String nombre, int despacho, String mail) {
		super(edad, nombre);
		this.despacho = despacho;
		this.mail = mail;
	}
	@Override
	public void Hablar() {
		System.out.println("Hola soy un profesor y se hablar "+this.edad+this.nombre+this.despacho+this.mail);
		
	}
}
