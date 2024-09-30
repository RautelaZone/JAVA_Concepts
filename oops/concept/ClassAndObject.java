package geek.java.oops.concept;

class Pen {

	String type;
	String color;

	public void action() {
		System.out.println("I am writing....");
	}

	public void displayColor() {
		System.out.println(this.color);
	}

	public void displayType() {
		System.out.println(this.type);
	}

}

public class ClassAndObject {

	public static void main(String[] args) {

		Pen p1 = new Pen();
		p1.type = "Gel";
		p1.color = "Blue";

		System.out.println("Action performed by p1 Object...");
		p1.displayType();
		p1.displayColor();
		p1.action();
		System.out.println("-----------------------------");

		Pen p2 = new Pen();
		p2.type = "Ball";
		p2.color = "Black";

		System.out.println("Action performed by p2 Object...");
		p2.displayType();
		p2.displayColor();
		p2.action();
	}
}
