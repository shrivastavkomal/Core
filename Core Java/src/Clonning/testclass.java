package Clonning;

public class testclass {
public static void main(String[] args) throws CloneNotSupportedException {
	customer c1= new customer("komal");
	customer c2 = (customer)c1.clone();
	System.out.println(c1.name);
	System.out.println(c1.account.balance);
	System.out.println(c2.name);
	System.out.println(c2.account.balance);
			}
}
 
