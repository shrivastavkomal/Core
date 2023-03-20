package callParentConstructor;

public class person {

	protected String firstName = null;
	protected String lastName = null;
	protected String address= null;
	
	public person() {
		System.out.println("default constructor");
		
	}
	public person (String a, String b) {
		this();
		firstName = a;
		lastName = b;
		System.out.println("2 param constructor is called");
		
	}
	public person(String a, String b, String address) {
		this(a,b);
		firstName = a;
		lastName = b;
		this.address = address;
		System.out.println("3 param constructor is called");
	}
		
	}
}
