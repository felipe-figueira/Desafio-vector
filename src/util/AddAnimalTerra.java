package util;

public class AddAnimalTerra extends AddAnimalAgua{
	
	@Override
	public void novoAnimal(String novoAnimal) {
		animais.add(novoAnimal);
		System.out.print("Um(a) ____________" + novoAnimal + ", mas um macaco não: ");
	}
}
