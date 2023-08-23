package figures;

public class Circle {
	
	// Defining the Circle attribute "radius".
	public float radius;
	
	// Defining the Circle constructor.
	// In this case, "this" is used to set the attribute apart from the local variable.
	public Circle(float radius) {
		this.radius = radius/100;
	}
	
	// Here, we assign a default value, using the "this" keyword, to the length attribute.
	public Circle() {
		this(159723/100);
	}
	
	// Defining the methods of the circle class.
	public float getCircumference() {
		return (float)3.141592*radius;
	}
	public float getArea() {
		return (float)3.141592*radius*radius;
	}
	
}
