import implementations.BeberEspartanoImp;
import implementations.BeberVikingoImp;
import implementations.OrinarEspartanoImp;
import implementations.OrinarVikingoImp;
import models.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

	static List<Humano> ganadores = new ArrayList<>();
	static List<Humano> perdedores = new ArrayList<>();
	static List<Vikingo> vikingos = new ArrayList<>();
	static List<Espartano> espartanos = new ArrayList<>();

	public static void main(String[] args) {
		
		Vikingo vikingo1 = new Vikingo("martin",25,75,new OrinarVikingoImp(),new BeberVikingoImp(),5);
		Vikingo vikingo2 = new Vikingo("matias",15,60,new OrinarVikingoImp(),new BeberVikingoImp(),2);
		Vikingo vikingo3 = new Vikingo("juan",30,67,new OrinarVikingoImp(),new BeberVikingoImp(),5);
		Vikingo vikingo4 = new Vikingo("leandro",40,78,new OrinarVikingoImp(),new BeberVikingoImp(),1);
		Vikingo vikingo5 = new Vikingo("agustin",20,80,new OrinarVikingoImp(),new BeberVikingoImp(),6);
		Vikingo vikingo6 = new Vikingo("carlos",27,95,new OrinarVikingoImp(),new BeberVikingoImp(),3);


		Espartano espartano1 = new Espartano("fernando",26,90, new OrinarEspartanoImp(), new BeberEspartanoImp(),2);
		Espartano espartano2 = new Espartano("luciano",30,80, new OrinarEspartanoImp(), new BeberEspartanoImp(),6);
		Espartano espartano3 = new Espartano("federico",40,70, new OrinarEspartanoImp(), new BeberEspartanoImp(),4);
		Espartano espartano4 = new Espartano("augusto",55,66, new OrinarEspartanoImp(), new BeberEspartanoImp(),1);
		Espartano espartano5 = new Espartano("lucas",19,101, new OrinarEspartanoImp(), new BeberEspartanoImp(),5);
		Espartano espartano6 = new Espartano("tomas",23,110, new OrinarEspartanoImp(), new BeberEspartanoImp(),3);


		espartanos.add(espartano1);
		espartanos.add(espartano2);
		espartanos.add(espartano3);
		espartanos.add(espartano4);
		espartanos.add(espartano5);
		espartanos.add(espartano6);


		vikingos.add(vikingo1);
		vikingos.add(vikingo2);
		vikingos.add(vikingo3);
		vikingos.add(vikingo4);
		vikingos.add(vikingo5);
		vikingos.add(vikingo6);

//
//		//ordeno los arreglos
//		espartanos.sort(Comparator.comparing(Humano::getPeso));
//		vikingos.sort(Comparator.comparing(Humano::getPeso));
//
//		System.out.println("VIKINGOS");
//		vikingos.forEach(vikingo -> System.out.println(vikingo.beber()));
//		System.out.println();
//		System.out.println("ESPARTANOS");
//		espartanos.forEach(espartano -> System.out.println(espartano.beber()));

		//ahora no se me ocurre como hacer para que peleen
		//TODO preguntar como hacer para que los vikingo y espartanos peleen

		while(!vikingos.isEmpty() && !espartanos.isEmpty()){
			pelear();
		}

		System.out.println("GANADORES!!!");
		ganadores.forEach(System.out::println);
		System.out.println("//////////////////////////");
		System.out.println("PERDEDORES");
		perdedores.forEach(System.out::println);

		//pelear(vikingos.get(1),espartanos.get(1));



	}

	public static void pelear(){
		Vikingo vikingo = vikingos.get(0);
		Espartano espartano = espartanos.get(0);
		int a;
		int b;

		do {
			a = vikingo.beber();
			b = espartano.beber();
		}while(!vikingo.orinar(a) && !espartano.orinar(b));

		if(vikingo.orinar(a) && !espartano.orinar(b)){
			//System.out.println("el vikingo " + vikingo.getNombre() + " ha perdido");
			ganadores.add(espartano);
			perdedores.add(vikingo);
			vikingos.remove(vikingo);
		} else if(!vikingo.orinar(a) && espartano.orinar(b)){
			//System.out.println("el espartano " + espartano.getNombre() + " ha perdido");
			ganadores.add(vikingo);
			perdedores.add(espartano);
			espartanos.remove(espartano);
		}else {
			//System.out.println("ambos perdieron");
			perdedores.add(espartano);
			perdedores.add(vikingo);
			vikingos.remove(vikingo);
			espartanos.remove(espartano);
		}


	}

}
