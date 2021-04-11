package models;

import interfaces.Beber;
import interfaces.Orinar;

import java.util.Random;

public class Vikingo extends Humano{

	private final Integer bebedorProfecional;
	private Random random;

	public Vikingo(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer bebedorProfecional) {
		super(nombre, edad, peso, orinar, beber);
		this.bebedorProfecional = bebedorProfecional;
	}

	public boolean orinar(int bebida) {
		random = new Random();
		return (bebida + random.nextInt(orinar.orinar())) >= 25;

	}


	public int beber() {
		random = new Random();
		if(random.nextBoolean()){
			return	random.nextInt(beber.beber()) - bebedorProfecional;
		}else {
			return random.nextInt(beber.beber());
		}

	}

	@Override
	public String toString() {
		return "Vikingo{" +
				"bebedorProfecional=" + bebedorProfecional +
				"} " + super.toString();
	}
}
