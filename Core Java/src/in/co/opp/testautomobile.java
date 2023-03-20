package in.co.opp;

public class testautomobile {
	public static void main(String[] args) {
		automobile a = new automobile();
		automobile.getNoOfGears();
		System.out.println(a.getNoOfGears());
		a.setColor("Blue");
		a.setSpeed(97);
		a.setMake("matel");
	
		System.out.println(a.getColor());
		System.out.println(a.getSpeed());
		System.out.println(a.getMake());
	}

}
