package exception_handling;

public class try_with_final {
	
	public static void main(String[] args) {
		int i = 20;
		int k = 0;
		System.out.println("Before Exception");
		try {
			int c = i/k;
	    	System.out.println("Div is"+c);
			
		} finally {
			
		} 	    	
	
		
	    System.out.println("After Exception");
	}

}
