package com.java.herencia.tipo;

public class Utilitario {

	/**
	 * Genera un # aleatorio entre dos números
	 * 
	 * @param min # máximo
	 * @param max # mínimo
	 * @return # aleatorio
	 */

	public static int generarAleatorio(int minimo, int maximo) {
		return (int) (Math.round(Math.random() * (maximo - minimo) + minimo));
	}
}
