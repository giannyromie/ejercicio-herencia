package com.java.herencia.tipo;

public class Utilitario {

	/**
	 * Genera un # aleatorio entre dos n�meros
	 * 
	 * @param min # m�ximo
	 * @param max # m�nimo
	 * @return # aleatorio
	 */

	public static int generarAleatorio(int minimo, int maximo) {
		return (int) (Math.round(Math.random() * (maximo - minimo) + minimo));
	}
}
