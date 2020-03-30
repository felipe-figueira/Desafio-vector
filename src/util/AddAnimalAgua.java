package util;

import java.util.ArrayList;
import java.util.List;

public class AddAnimalAgua {
	
	protected List<String> animais = new ArrayList<>();
	private List<String> animaisCaracteristica = new ArrayList<>();
	
	public AddAnimalAgua() {
		
	}
	
	public List<String> getAnimais() {
		return animais;
	}

	public void setAnimais(List<String> animais) {
		this.animais = animais;
	}
	
	public List<String> getAnimaisCaracteristica() {
		return animaisCaracteristica;
	}

	public void setAnimaisCaracteristica(List<String> animaisCaracteristica) {
		this.animaisCaracteristica = animaisCaracteristica;
	}

	public void novoAnimal(String novoAnimal) {
		animais.add(novoAnimal);
		System.out.print("Um(a) ____________" + novoAnimal + ", mas um tubarão não: ");
	}
	public void novoAnimalCaracteristica(String novoAnimalCaracteristica) {
		animaisCaracteristica.add(novoAnimalCaracteristica);	
	}
	
}
