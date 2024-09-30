package geek.java.oops.concept;

interface NewAnimal {

	public static final int eyes = 2;
	int ears = 2; // By default, variables are public, static and final.

	void walk();
	public abstract void eat(); // By default, methods are public and abstract.
}

class Cow implements NewAnimal {

	public void walk() {
		System.out.println("Cow runs on 4 legs.");
	}

	public void eat() {
		System.out.println("Cow eats.");
	}

}

public class InterfaceConcept {

	public static void main(String[] args) {

		Cow c = new Cow();
		c.walk();
		c.eat();

		// As variables are static in nature so can be called using class name
		System.out.println("Eyes:" + NewAnimal.eyes);
		System.out.println("Ears:" + NewAnimal.ears);

	}

}
