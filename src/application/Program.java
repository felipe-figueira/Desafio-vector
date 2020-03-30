package application;

import java.util.Scanner;

import util.AddAnimalAgua;
import util.AddAnimalTerra;
import util.Animais;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddAnimalAgua addAnimal = new AddAnimalAgua();
		AddAnimalTerra addAnimalTerra = new AddAnimalTerra();
		int cont = 0;

		do {
			System.out.println("Pense em um animal.");

			System.out.print("o animal que você pensou vive na água ?" + " Digite '1' para sim e '2' para não: ");
			int resp = sc.nextInt();

			if (resp == 1) {

				if (addAnimal.getAnimaisCaracteristica().size() > 0) {
					for (int i = 0; i < addAnimal.getAnimaisCaracteristica().size(); i++) {
						System.out.println("O animal que você pensou " + addAnimal.getAnimaisCaracteristica().get(i)
								+ "?" + " Digite '1' para sim e '2' para não: ");
						int animalNovo = sc.nextInt();
						if (animalNovo == 1) {
							System.out.println("É um " + addAnimal.getAnimais().get(i) + "?" + " Digite '1' para sim e '2' para não: ");
							int afirma = sc.nextInt();
							if(afirma == 1) {
								Animais.fim();
							}
							
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
				} else if (respTerra == 2) {

					System.out.println("Qual animal você pensou?");
					String novoAnimal = sc.next();
					addAnimalTerra.novoAnimal(novoAnimal);
					String novoAnimalCaracteristica = sc.next();
					addAnimalTerra.novoAnimalCaracteristica(novoAnimalCaracteristica);

				}

			}
		} while (cont != 1000);

		sc.close();
	}

}
