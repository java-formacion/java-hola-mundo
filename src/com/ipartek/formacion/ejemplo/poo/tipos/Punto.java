package com.ipartek.formacion.ejemplo.poo.tipos;

public class Punto {
	private int x, y;
	
	public static final int X_POR_DEFECTO =0;
	public static final int Y_POR_DEFECTO =0;


	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x < 0)
			throw new RuntimeException("Debe teber la x un valor superior a 0");
		this.x = x;//el RuntimeException saca un mensaje de error en caso de que falle el if 
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Punto(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Punto() {
		this(0,0);//con this aqui llamamos al constructor previo
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {//intenta resumir toda la informacion del objeto en un solo numero
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	

}
