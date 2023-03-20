package in.co.polymorphism;

public class triangle extends shape{
	
	public triangle(String color, int bordetrwidth, int base, int height) {
		super(color, bordetrwidth);
	this.base=base;
	this.height=height;
			
	}
	@Override
	public double area2() {
		
		return base*height;
	}
	int base;
	int height;
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	

}
