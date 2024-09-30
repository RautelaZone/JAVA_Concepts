package geek.java.oops.concept;

class Shape2 {
	public void area() {
		System.out.println("Displays Area.");
	}
}

class Triangle2 extends Shape {
	public void area() {
		System.out.println("Displays Triangle Area.");
	}
}

class Circle{
	public void area() {
		System.out.println("Displays Circle Area.");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.area();
		
		Triangle2 t = new Triangle2();
		t.area();

	}

}
