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

			System.out.print("o animal que voc� pensou vive na �gua ?" + " Digite '1' para sim e '2' para n�o: ");
			int resp = sc.nextInt();

			if (resp == 1) {

				if (addAnimal.getAnimaisCaracteristica().size() > 0) {
					for (int i = 0; i < addAnimal.getAnimaisCaracteristica().size(); i++) {
						System.out.print("O animal que voc� pensou " + addAnimal.getAnimaisCaracteristica().get(i)
								+ "?" + " Digite '1' para sim e '2' para n�o: ");
						int animalNovo = sc.nextInt();
						if (animalNovo == 1) {
							System.out.print("� um " + addAnimal.getAnimais().get(i) + "?"
									+ " Digite '1' para sim e '2' para n�o: ");
							int afirma = sc.nextInt();
							if (afirma == 1) {
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

					System.out.print("Qual animal voc� pensou?");
					String novoAnimal = sc.next();
					addAnimal.novoAnimal(novoAnimal);
					String novoAnimalCaracteristica = sc.next();
					addAnimal.novoAnimalCaracteristica(novoAnimalCaracteristica);

				}

			} else if (resp == 2) {

				if (addAnimalTerra.getAnimaisCaracteristica().size() > 0) {
					for (int i = 0; i < addAnimalTerra.getAnimaisCaracteristica().size(); i++) {
						System.out
								.println("O animal que voc� pensou " + addAnimalTerra.getAnimaisCaracteristica().get(i)
										+ "?" + " Digite '1' para sim e '2' para n�o: ");
						int animalNovo = sc.nextInt();
						if (animalNovo == 1) {
							System.out.println("� um " + addAnimalTerra.getAnimais().get(i) + "?"
									+ " Digite '1' para sim e '2' para n�o: ");
							int afirma = sc.nextInt();
							if (afirma == 1) {
								Animais.fim();
							}

						}
					}
				}

				Animais.animalAguaNao();
				int respTerra = sc.nextInt();

				if (respTerra == 1) {
					Animais.fim();
				} else if (respTerra == 2) {

					System.out.println("Qual animal voc� pensou?");
					String novoAnimal = sc.next();
					addAnimalTerra.novoAnimal(novoAnimal);
					String novoAnimalCaracteristica = sc.next();
					addAnimalTerra.novoAnimalCaracteristica(novoAnimalCaracteristica);

				}

			}else {
				continue;
			}
		} while (cont != 100);

		sc.close();
	}

}
