package util;

public class AddAnimalTerra extends AddAnimalAgua{
	
	@Override
	public void novoAnimal(String novoAnimal) {
		animais.add(novoAnimal);
		for(String w : animais) {
			System.out.println(w);
		}
		System.out.print("Um(a) ____________" + novoAnimal + ", mas um macaco n�o: ");
	}
}
