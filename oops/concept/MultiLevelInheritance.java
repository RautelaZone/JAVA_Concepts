package geek.java.oops.concept;

class Shape1 {
	public void area() {
		System.out.println("Displays Area.");
	}
}

class Triangle1 extends Shape {
	public void area() {
		System.out.println("Displays Triangle Area.");
	}
}

class EquilateralTriangle extends Triangle1 {
	public void area() {
		System.out.println("Displays Equilateral Triangle Area.");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {

		EquilateralTriangle t = new EquilateralTriangle();
		t.area();

	}

}
