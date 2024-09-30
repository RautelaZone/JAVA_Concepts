package geek.java.oops.concept;

abstract class Animal {
	abstract void walk();

	public void eat() {
		System.out.println("Animal eats.");
	}

	final void herbivores() {
		System.out.println("Only eat grass.");
	}
}

class Horse extends Animal {
	public void walk() {
		System.out.println("Horse walks on 4 legs.");
	}
}

class Chicken extends Animal {
	public void walk() {
		System.out.println("Chicken walks on 2 legs.");
	}
}

public class AbstractionConcept {

	public static void main(String[] args) {

		Horse h = new Horse();
		h.walk();
		h.eat();
		h.herbivores();
		System.out.println("------------------------");
		Chicken c = new Chicken();
		c.walk();
		c.eat();
		c.herbivores();

	}

}
