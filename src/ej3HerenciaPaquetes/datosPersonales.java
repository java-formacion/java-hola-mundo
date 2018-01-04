package ej3HerenciaPaquetes;

public class datosPersonales {

	private String nombreAve, nombreDueno;

	public datosPersonales(String nombreAve, String nombreDueno) {
		nombreAve = nombreAve;
		nombreDueno = nombreDueno;
	}

	public String getNombreAve() {
		return nombreAve;
	}

	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

	void cantar() {

	}
}
