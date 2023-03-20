package Methods;

public class methodclass {

	public static void main(String[] args) {
		
		CoreBank b = new CoreBank();
		b.fundTransfer();
		b.deposits(100);
		b.interest(1000,100);
	}
}
