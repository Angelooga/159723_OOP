package createFigures;

public class Circle {
	// Defining the Square class attribute "radius".
	float radius;
	int choice;
	
	// Here, we assign a default value, using the "this" keyword, to the length attribute.
	public Circle() {
		this(159723/100, 1);
	}
	// Creating the Circle constructor.
	// In this case, "this" is used to set the attribute apart from the local variable.
	public Circle(float radius, int choice) {
		this.radius = radius;
		this.choice = choice;
	}

	// Defining the methods of the Circle class.
	public float getCircumference() {
		return (float)3.141592*2*radius;
	}
	public float getArea() {
		return (float)3.141592*radius*radius;
	}
	// Method to print any of the chosen parameters.
	public void printParam() {
		if(choice == 1) {
			System.out.println("\nThe circumference of the circle is "
					+ this.getCircumference()
					+  " units.");
		}else {
			System.out.println("\nThe area of the circle is "
					+ this.getArea()
					+  " units.");
		}
	}
}
