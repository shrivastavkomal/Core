package oop.inheritance;

public class testrectangle {
	
	public static void main(String[] args) {
		
		rectangle r = new rectangle();
		r.setColor("Red");
		r.setWidth(10);
        r.setBorderwidth(20);
        r.setLength(40);
	    
	System.out.println(r.getBorderwidth());
	System.out.println(r.getColor());
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
	System.out.println("Area"+"\t"+r.getWidth()*r.getLength());
	}

}
