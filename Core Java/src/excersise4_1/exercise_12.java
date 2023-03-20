package excersise4_1;

public class exercise_12 {
	
	public static void main(String[] args) {
		int r,sum = 0,a;
		int n= 454;
		 a = n;
		while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
	}
	if( a==sum)
	System.out.println("palindrome number");
	else 
	System.out.println("not palindrome");
}}

