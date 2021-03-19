package models;

import interfaces.Beber;
import interfaces.Orinar;

public class Vikingo extends Humano{

	private Integer bebedorProfecional;

	public Vikingo(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer bebedorProfecional) {
		super(nombre, edad, peso, orinar, beber);
		this.bebedorProfecional = bebedorProfecional;
	}

	public Integer getBebedorProfecional() {
		return bebedorProfecional;
	}

	public void setBebedorProfecional(Integer bebedorProfecional) {
		this.bebedorProfecional = bebedorProfecional;
	}


	public void orinar() {
		orinar.orinar();
		
	}


	public void beber() {
		beber.beber();
		
	}

	@Override
	public String toString() {
		return "Vikingo{" +
				"bebedorProfecional=" + bebedorProfecional +
				"} " + super.toString();
	}
}
