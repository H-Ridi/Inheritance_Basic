package Inheritance_1;

import OOP_model.Circle;
import OOP_model.Triangle;

public class OOP_Inheritance_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		System.out.println(circle.area(6));
		System.out.println(triangle.area(6,4));

	}

}
