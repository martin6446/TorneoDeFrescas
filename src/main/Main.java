package main;

import models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Vikingo vikingo1 = new Vikingo("martin",25,75,new OrinarVikingoImp(),new BeberVikingoImp(),15);
		Vikingo vikingo2 = new Vikingo("matias",15,60,new OrinarVikingoImp(),new BeberVikingoImp(),20);
		Vikingo vikingo3 = new Vikingo("juan",30,67,new OrinarVikingoImp(),new BeberVikingoImp(),5);
		Vikingo vikingo4 = new Vikingo("leandro",40,78,new OrinarVikingoImp(),new BeberVikingoImp(),10);
		Vikingo vikingo5 = new Vikingo("agustin",20,80,new OrinarVikingoImp(),new BeberVikingoImp(),8);
		Vikingo vikingo6 = new Vikingo("carlos",27,95,new OrinarVikingoImp(),new BeberVikingoImp(),30);


		Espartano espartano1 = new Espartano("fernando",26,90, new OrinarEspartanoImp(), new BeberEspartanoImp(),20);
		Espartano espartano2 = new Espartano("luciano",30,80, new OrinarEspartanoImp(), new BeberEspartanoImp(),6);
		Espartano espartano3 = new Espartano("federico",40,70, new OrinarEspartanoImp(), new BeberEspartanoImp(),12);
		Espartano espartano4 = new Espartano("augusto",55,66, new OrinarEspartanoImp(), new BeberEspartanoImp(),8);
		Espartano espartano5 = new Espartano("lucas",19,101, new OrinarEspartanoImp(), new BeberEspartanoImp(),15);
		Espartano espartano6 = new Espartano("tomas",23,110, new OrinarEspartanoImp(), new BeberEspartanoImp(),21);

		List<Espartano> espartanos = new ArrayList<>();
		espartanos.add(espartano1);
		espartanos.add(espartano2);
		espartanos.add(espartano3);
		espartanos.add(espartano4);
		espartanos.add(espartano5);
		espartanos.add(espartano6);



		List<Vikingo> vikingos = new ArrayList<>();
		vikingos.add(vikingo1);
		vikingos.add(vikingo2);
		vikingos.add(vikingo3);
		vikingos.add(vikingo4);
		vikingos.add(vikingo5);
		vikingos.add(vikingo6);


		//ordeno los arreglos
		espartanos.sort(Comparator.comparing(Humano::getPeso));
		vikingos.sort(Comparator.comparing(Humano::getPeso));

		vikingos.forEach(System.out::println);
		System.out.println();
		espartanos.forEach(System.out::println);

		//ahora no se me ocurre como hacer para que peleen
		//TODO preguntar como hacer para que los vikingo y espartanos peleen
		


	}

}
