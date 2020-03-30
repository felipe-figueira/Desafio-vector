package vector;

import java.util.Scanner;

import entities.AddAnimal;
import entities.Animais;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Pense em um animal.");

		System.out.print("o animal que você pensou vive na água ?" + " Digite '1' para sim e '2' para não: ");
		int resp = sc.nextInt();

		if (resp == 1) {

			Animais.animalAguaSim();
			int resp2 = sc.nextInt();

			if (resp2 == 1) {
				Animais.fim();
				
			} else if (resp2 == 2) {
				AddAnimal addAnimal = new AddAnimal();
				System.out.println("Qual animal você pensou?");
				String novoAnimal = sc.next();
				addAnimal.novoAnimal(novoAnimal);
				String novoAnimalCaracteristica = sc.next();
				addAnimal.novoAnimalCaracteristica(novoAnimalCaracteristica);	
			}
		}else if(resp == 2) {
			Animais.animalAguaNao();
			int respNao = sc.nextInt();
			
		}

		
		sc.close();
	}

}
