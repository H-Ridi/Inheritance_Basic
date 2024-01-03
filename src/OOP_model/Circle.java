package OOP_model;

public class Circle extends Shape {


	public double radian=3.1416;
	
	public double area(int r) {
		return radian* super.area(r)* super.area(r);
	};
	
	
	
}
