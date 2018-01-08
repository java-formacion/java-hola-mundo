package com.ipartek.formacion.ejemplopoo.tipos;

/**
 * Clase para generar excepciones propias
 * @author java
 *
 */
public class PuntoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6557401042146736841L;

	public PuntoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PuntoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PuntoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PuntoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PuntoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
