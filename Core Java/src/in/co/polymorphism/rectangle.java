package in.co.polymorphism;

public class rectangle extends shape{
	public rectangle(String color, int bordetrwidth,int length,int width) {
		super(color, bordetrwidth);
		this.length=length;
		this.width=width;
	}
	
	@Override
	public double area() {
		
		return length*width;
	}
	int length;
	int width;
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	

	
	
	

}
