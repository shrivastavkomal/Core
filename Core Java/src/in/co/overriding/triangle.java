package in.co.overriding;

public class triangle extends shape {
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
		
	}
	public double area() {
		double tArea = base*height;
		System.out.println("area="+tArea);
		return 0;
		
	}

}
