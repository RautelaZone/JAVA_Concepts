package geek.java.oops.concept;

class Teacher {

	String name;
	int age;

	Teacher(String name, int age) {
		System.out.println("Parameterized Constructor Calling...");
		this.name = name;
		this.age = age;
	}

	public void printTeacherInfo() {
		System.out.println("Teacher Name: " + this.name);
		System.out.println("Teacher Age: " + this.age);
	}
}

public class ParametrizedConstructor {

	public static void main(String[] args) {

		Teacher st = new Teacher("Sumit", 25);
		st.printTeacherInfo();
		
		Teacher st1 = new Teacher("Anil", 28);
		st1.printTeacherInfo();

	}

}
