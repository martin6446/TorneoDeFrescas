package main;

import models.BeberEspartanoImp;
import models.BeberVikingoImp;
import models.Espartano;
import models.OrinarEspartanoImp;
import models.OrinarVikingoImp;
import models.Vikingo;

public class Main {

	public static void main(String[] args) {
		
		Vikingo vikingo = new Vikingo("martin",25,75,new OrinarVikingoImp(),new BeberVikingoImp(),15);
		Espartano espartano = new Espartano("fernando",26,90, new OrinarEspartanoImp(), new BeberEspartanoImp(),20);
		
		vikingo.beber();
		vikingo.orinar();
		espartano.beber();
		espartano.orinar();
	}

}
