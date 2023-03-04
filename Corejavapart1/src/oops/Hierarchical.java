package oops;

class Animal {
	String type = "pet";
	void display() {
		System.out.println("Type: "+type);
	}
}
class Dog extends Animal {
	String dogVoice = "Bark";
	void displayDog() {
		System.out.println("Dog can "+dogVoice);
	}
}
class Cat extends Animal {
	String catVoice = "Meow";
	void displayCat() {
		System.out.println("Cat can "+catVoice);
	}
}
class Horse extends Animal {
	String horseVoice = "Neighs";
	void displayHorse() {
		System.out.println("Horse "+horseVoice);
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		Cat c = new Cat();
		Horse h = new Horse();
		d.display();
		d.displayDog();
		c.displayCat();
		h.displayHorse();
	}

}
