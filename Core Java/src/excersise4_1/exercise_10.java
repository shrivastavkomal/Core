package excersise4_1;

public class exercise_10 {

	public static void main(String[] args) {
		
		int n = 153;
		
		int a = n;
		int b = 0;
		while(n>0) {
		int c=n%10;
		b=(b)+(c*c*c);
		n=n/10;
		}
		if(a==b) {
			System.out.println("arm");
		}else {
				System.out.println("not arm");
			}
		}
	}
	
	

	

