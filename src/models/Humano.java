package models;

import interfaces.Beber;
import interfaces.Orinar;

public abstract class Humano{
	private String nombre;
	private Integer edad;
	private Integer peso;
	protected Orinar orinar;
	protected Beber beber;
	
	
	public Humano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.orinar = orinar;
		this.beber = beber;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Humano{" +
				"nombre='" + nombre + '\'' +
				", edad=" + edad +
				", peso=" + peso +
				", orinar=" + orinar +
				", beber=" + beber +
				'}';
	}
}
