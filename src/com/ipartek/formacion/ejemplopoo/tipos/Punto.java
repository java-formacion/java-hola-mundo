package com.ipartek.formacion.ejemplopoo.tipos;

/**
 * Clase de ejemplo de orientación a objetos
 * 
 * @author java
 *
 */
public class Punto {

	private int x;
	private int y;

	public static final int X_POR_DEFECTO = 0;
	public static final int Y_POR_DEFECTO = 0;

	public int getX() {
		return x;
	}

	/**
	 * Método de acceso para escribir el valor de la x
	 * 
	 * @param x
	 *            Valor a asignar a la propiedad x
	 */
	public void setX(int x) {
		if (x < 0) {
			throw new PuntoException("Debe tener la X un valor superior a 0");
		}
		this.x = x;
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

		this(X_POR_DEFECTO, Y_POR_DEFECTO);

	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
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
