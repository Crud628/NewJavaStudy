package Day05;

public class Circle {
	double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	public Circle() {
		super();
	}
	
	public double area() {
		return Math.PI*r*r;
	}
}
