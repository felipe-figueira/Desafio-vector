package entities;

import java.util.ArrayList;
import java.util.List;

public class AddAnimal {
	
	private List<String> animais = new ArrayList<>();
	private List<String> animaisCaracteristica = new ArrayList<>();
	
	public AddAnimal() {
		
	}
	
	public List<String> getAnimais() {
		return animais;
	}

	public void setAnimais(List<String> animais) {
		this.animais = animais;
	}

	public void novoAnimal(String novoAnimal) {
		animais.add(novoAnimal);
		for(String w : animais) {
			System.out.println(w);
		}
		System.out.println("Um(a) " + novoAnimal + ", mas um tubarão não");
	}
	public void novoAnimalCaracteristica(String novoAnimalCaracteristica) {
		animaisCaracteristica.add(novoAnimalCaracteristica);
		for(String w : animaisCaracteristica) {
			System.out.println(w);
		}
	}
	
}
