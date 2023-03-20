package in.co.overriding;

public class shape {
	private String color;
	private int borderwidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public double area() {
		System.out.println("Area");
		return 0;
		 
	}

}
