package geek.java.oops.concept;

class Student {

	Student() {
		System.out.println("Default Constructor Calling - Without Parameterized.");
	}

	public void printHello() {
		System.out.println("Hello World!");
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {

		Student st = new Student();
		st.printHello();

	}

}
