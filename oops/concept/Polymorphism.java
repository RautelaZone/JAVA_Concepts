package geek.java.oops.concept;

public class Polymorphism {
	
	// Concept of Method Overloading

	public void javaMethod(String name) {
		System.out.println("Name: " + name);
	}

	public void javaMethod(int age) {
		System.out.println("Age: " + age);
	}

	public void javaMethod(String name, int age) {
		System.out.println("Name: " + name + " & Age: " + age);
	}

	public static void main(String[] args) {

		Polymorphism p = new Polymorphism();
		p.javaMethod("Sumit");
		p.javaMethod(32);
		p.javaMethod("Ajay", 25);

	}

}
