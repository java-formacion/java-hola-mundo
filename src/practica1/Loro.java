package practica1;

public class Loro extends Ave{
	char region;
	String color;
	public Loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}
	
	void deDondeEres() {
		switch (region) {
		case 'n': System.out.println("Norte");
			
			break;
		case 's': System.out.println("sur");
		
		break;
		case 'e': System.out.println("este");
		
		break;
		case 'o': System.out.println("Oeste");
		
		break;
		default:
			break;
		}
	}

	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
