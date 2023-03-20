package in.co.overriding;

public class circle extends shape {
private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
	
}
public double area() {
	return 22/7*radius*radius;
	
}
	
}

