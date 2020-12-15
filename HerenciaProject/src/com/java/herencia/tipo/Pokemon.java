package com.java.herencia.tipo;

import com.java.herencia.Ataque;

/**
 * @author GIANNY
 * 
 *         Clase Padre de todos los pokemons
 *         
 */
public class Pokemon {

//nombre del pokeo
	private String nombre;

//vida que actual del pokemon
	private int vidaActual;

//energía actual del pokemon
	private int energiaActual;

//agravios que el pokemon sufrió
	protected int agravio;

//defensa que el pokemon tiene
	protected int defensa;

//la precisión con la que el pokemon ataca
	protected int precision;

	private Ataque[] ataques = new Ataque[4];

	/**
	 * @param nombre
	 * @param vidaActual
	 * @param energiaActual
	 */
	public Pokemon(String nombre, int vidaActual, int energiaActual) {
		super();
		this.nombre = nombre;
		this.vidaActual = vidaActual;
		this.energiaActual = energiaActual;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public int getEnergiaActual() {
		return energiaActual;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setVidaActual(int vidaActual) {
		this.vidaActual = vidaActual;
	}

	public void setEnergiaActual(int energiaActual) {
		this.energiaActual = energiaActual;
	}

	public Ataque getAtaques(int indice) {
		if (indice >= 0 && indice <= 4)
			return ataques[indice];
		return null;
	}
	
	/**
	 * Genera 4 ataques para el pokemon de forma aleatoria
	 * 
	 * @param minimo
	 * @param maximo
	 */
	protected void generarAtaques(int minimo, int maximo) {
		int i = 0;

		ataques[i] = Ataque.values()[Utilitario.generarAleatorio(minimo, maximo)];
		for (i = 1; i < ataques.length; i++) {
			ataques[i] = Ataque.values()[Utilitario.generarAleatorio(minimo, maximo)];
			for (int j = 0; j < i; j++) {
				if (ataques[i] == ataques[j]) {
					i--;
				}
			}
		}
	}
}
