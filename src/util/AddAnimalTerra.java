package util;

public class AddAnimalTerra extends AddAnimalAgua{
	
	@Override
	public void novoAnimal(String novoAnimal) {
		animais.add(novoAnimal);
		System.out.print("Um(a) " + novoAnimal + "____________, mas um macaco não: ");
	}
}
