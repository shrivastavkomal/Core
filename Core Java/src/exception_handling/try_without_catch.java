package exception_handling;

public class try_without_catch {
	public static void main(String[] args) {
		int i = 20;
		int b = 0;
		System.out.println("Before Exception");
		try {
			int c = i/ b;
			System.out.println("Div is"+ c);
		} 	
		 
		
		
		System.out.println("After Exception");
		
	}

}



