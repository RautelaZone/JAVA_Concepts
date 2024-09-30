package geek.java.oops.concept;


class Shape {
	public void area() {
		System.out.println("Displays Area.");
	}	
}

class Triangle extends Shape {
	public void area() {
		System.out.println("Displays Triangle Area.");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.area();

	}

}
