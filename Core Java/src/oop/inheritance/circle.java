package oop.inheritance;

public class circle extends shape{
	private int radius;
	private int pi;

	public int getPi() {
		return pi;
	}

	public void setPi(int pi) {
		this.pi = pi;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	 public double area () {
		 return 22/7*radius*radius;
	 }
}
