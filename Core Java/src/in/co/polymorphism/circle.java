package in.co.polymorphism;

public class circle extends shape {
	
	public circle(String color, int bordetrwidth, int radius) {
		super(color, bordetrwidth);
		this.radius=radius;
	}

	int radius;

	public int getRadius() {
		return radius;
	}

	@Override
	public double area1() {
		
		return 22/7*radius*radius;
	}
	

}
