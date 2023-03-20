package in.co.opp;

public class account {
	private String number;
	private String AccountType;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public double diposite(double amount) {
		if(amount<0) {	
			System.out.println("please deposite only+value");
		}else if(amount==0) {
			System.out.println("please enter greater than 0");
		}else {
			balance+= amount;
		}
		return balance;
	}
	public double withdrawl(double amount) {
		balance -=amount;
		
		
		return balance;
		
		
	}
	public void setNumber(int i) {

		
	}
	
	
	}


