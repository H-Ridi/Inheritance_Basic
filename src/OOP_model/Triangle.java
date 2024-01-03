package OOP_model;

public class Triangle extends Shape{

	public int base;
	public int height;
	
	public double area(int b,int h) {
		return 0.5 * super.area(b) * super.area(h);
	}
}
