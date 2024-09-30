package geek.java.oops.concept;

class Parent {

	String name;
	int age;

	// copy the entire constructor
	Parent(Parent p) {
		this.name = p.name;
		this.age = p.age;
	}

	Parent() {
		// Need to create a constructor
	}

	public void parentInfo() {
		System.out.println("Parent Name: " + this.name);
		System.out.println("Parent Age: " + this.age);
		;
	}
}

public class CopyConstructor {

	public static void main(String[] args) {

		Parent par = new Parent();
		par.name = "Mr. Old Parent";
		par.age = 35;

		Parent par1 = new Parent(par); // Copied constructor of Parent p
		par1.parentInfo();

	}

}
