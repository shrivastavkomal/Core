package in.co.constructor_call;

public class person {
	
	protected String firstName = null;
	protected String lastName = null;
	protected String address = null;
	public person() {
		System.out.println("person default constructor");
		
		
	}
public person(String a, String b) {
	this();
	firstName = a;
	lastName = b;
	System.out.println("2 params constructor is calle");	
}
public person(String a, String b, String address) {
	this(a,b);
	firstName = a;
	lastName = b;
	this.address = address;
	System.out.println("3 params constructor is called");
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getAddress() {
	return address;
}

}
