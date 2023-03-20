package oop.inheritance;

public class test_circle {
	
	public static void main(String[] args) {
		
		circle c = new circle();
		c.setPi(22/7);
		c.setRadius(12);
		c.setBorderwidth(10);
		c.setColor("Yellow");
		System.out.println(c.getBorderwidth());
		System.out.println(c.getRadius());
		System.out.println(c.getPi());
		System.out.println(c.getColor());
		System.out.println(c.area());
		
		
	}

}
