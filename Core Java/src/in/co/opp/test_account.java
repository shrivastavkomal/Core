package in.co.opp;

public class test_account {
	public static void main(String[] args) {
		account a=new account();
		a.setAccountType("sbi");
		a.setNumber(1234567);
		System.out.println(a.getAccountType());
		System.out.println(a.getNumber());
		System.out.println(a.diposite(987));
		System.out.println(a.withdrawl(98));
	
		
		
	}

}
