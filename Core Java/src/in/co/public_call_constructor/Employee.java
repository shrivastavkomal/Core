
package in.co.public_call_constructor;

import in.co.constructor_call.person;

public class Employee extends person {
	private String designation = null;
	public Employee() {
		System.out.println("Default constructor");
		
	}
	
public Employee(String a, String b, String address) {
	super(a,b);
	this.designation = designation;
	System.out.println("Super class");
	
}
}
