package animals;

public class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void moveAnimal(Animal animal) {
		animal.move();
		animal.moveAnimal(new Human());
		animal.moveAnimal(new Tiger());
		animal.moveAnimal(new Eagles());
	}
}
