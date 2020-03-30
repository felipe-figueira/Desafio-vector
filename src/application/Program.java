package application;

import java.util.Scanner;

import entities.AddAnimal;
import entities.Animais;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddAnimal addAnimal = new AddAnimal();
		int cont= 0;
		do {
		System.out.println("Pense em um animal.");
		

		System.out.print("o animal que você pensou vive na água ?" + " Digite '1' para sim e '2' para não: ");
		int resp = sc.nextInt();

		if (resp == 1) {

			if (addAnimal.getAnimaisCaracteristica().size() > 0) {
				for(int i = 0; i < addAnimal.getAnimaisCaracteristica().size() ; i++) {
					System.out.println(	"O animal que você pensou "+ addAnimal.getAnimaisCaracteristica().get(i) + "?"+ " Digite '1' para sim e '2' para não: ");
					int animalNovo = sc.nextInt();
					if(animalNovo == 1) {
						Animais.fim();
						System.exit(0);
					}
				}
				
			}
			Animais.animalAguaSim();
			int resp2 = sc.nextInt();

			if (resp2 == 1) {
				Animais.fim();

			} else if (resp2 == 2) {
				
				System.out.println("Qual animal você pensou?");
				String novoAnimal = sc.next();
				addAnimal.novoAnimal(novoAnimal);
				String novoAnimalCaracteristica = sc.next();
				addAnimal.novoAnimalCaracteristica(novoAnimalCaracteristica);
				
			}

		} else if (resp == 2) {
			Animais.animalAguaNao();
			int respTerra = sc.nextInt();
			
			if (respTerra == 1) {
				Animais.fim();
			}else if (respTerra == 2) {
				
				System.out.println("Qual animal você pensou?");
				String novoAnimal = sc.next();
				addAnimal.novoAnimal(novoAnimal);
				String novoAnimalCaracteristica = sc.next();
				addAnimal.novoAnimalCaracteristica(novoAnimalCaracteristica);
				
			}

		}
		}while(cont != 1000);

		sc.close();
	}

}
