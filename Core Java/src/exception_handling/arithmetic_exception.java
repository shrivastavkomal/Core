package exception_handling;

public class arithmetic_exception {
	public static void main(String[] args) {
		int i = 20;
		int b = 0;
		System.out.println("Before Exception");
		try {
			int c = i/ b;
			System.out.println("Div is"+ c);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("After Exception");
		
	}

}
