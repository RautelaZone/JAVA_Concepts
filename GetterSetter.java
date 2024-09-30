package geek.java.oops.concept;


// Gettr Setter are used to access and set sensitive data i.; which are private
class GetSet {

	private String password;

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}
}

public class GetterSetter {

	public static void main(String[] args) {

		GetSet gs = new GetSet();

		gs.setPassword("QWER@123");
		System.out.println("Password is: " + gs.getPassword());
	}
}
