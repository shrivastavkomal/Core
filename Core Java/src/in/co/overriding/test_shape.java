package in.co.overriding;

public class test_shape {
	public static void main(String[] args) {
		rectangle r = new rectangle();
		shape s= new shape();
		circle c = new circle();
		triangle t = new triangle();
		shape s3= new triangle();
		triangle t1=(triangle)s3;
		shape s1 = new rectangle();
		shape s2 = new circle();
		circle c1 = (circle)s2;
		rectangle r1 = (rectangle)s1;
		r1.setBorderwidth(10);
		r1.setColor("Yellow");
		r1.setLength(20);
		r1.setWidth(30);
		s1.area();
		c1.setRadius(22/7);
		t1.setBase(10);
		t1.setHeight(20);
		t1.area();
		System.out.println(r1.getBorderwidth());
		System.out.println(r1.getColor());
		System.out.println(c1.area());
		System.out.println(t1.area());
	}
}
