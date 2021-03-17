package models;

import interfaces.Beber;
import interfaces.Orinar;

public class Espartano extends Humano{

	private Integer toleranciaExtra;

	public Espartano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer toleranciaExtra) {
		super(nombre, edad, peso, orinar, beber);
		this.toleranciaExtra = toleranciaExtra;
	}

	public Integer getToleranciaExtra() {
		return toleranciaExtra;
	}

	public void setToleranciaExtra(Integer toleranciaExtra) {
		this.toleranciaExtra = toleranciaExtra;
	}


	public void orinar() {
		orinar.orinar();
		
	}


	public void beber() {
		beber.beber();
		
	}
	
	
}
