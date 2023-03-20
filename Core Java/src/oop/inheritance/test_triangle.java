package oop.inheritance;

public class test_triangle {
	public static void main(String[] args) {
		triangle t = new triangle();
		t.setBase(10);
		t.setHeight(20);
		t.setBorderwidth(5);
		t.setColor("Red");
		System.out.println(t.getBase());
		System.out.println(t.getBorderwidth());
		System.out.println(t.getColor());
		System.out.println(t.getHeight());
		System.out.println("Area"+"\t"+(t.getBase()*t.getHeight()));
		
	}

}
