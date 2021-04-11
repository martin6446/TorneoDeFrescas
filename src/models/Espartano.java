package models;

import interfaces.Beber;
import interfaces.Orinar;

import java.util.Random;

public class Espartano extends Humano{

	private final Integer toleranciaExtra;
	private Random random;

	public Espartano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer toleranciaExtra) {
		super(nombre, edad, peso, orinar, beber);
		this.toleranciaExtra = toleranciaExtra;
	}

	public boolean orinar(int bebida) {
		random = new Random();

		if(random.nextBoolean()){
			return ((random.nextInt(orinar.orinar()) + bebida) - toleranciaExtra) >= 25;
		}else {
			return (random.nextInt(orinar.orinar()) + bebida) >= 25;
		}
	}


	public int  beber() {
		random = new Random();
		return random.nextInt(beber.beber());
    }

	@Override
	public String toString() {
		return "Espartano{" +
				"toleranciaExtra=" + toleranciaExtra +
				"} " + super.toString();
	}
}
