package createFigures;
import java.lang.Math;

public class Square {
	// Defining the Square class attribute "length".
	float length;
	int choice;
	
	// Here, we assign a default value, using the "this" keyword, to the length attribute.
	public Square() {
		this(159723/100, 1);
	}
	// Creating another Square constructor.
	// In this case, "this" is used to set the attribute apart from the local variable.
	public Square(float length, int choice) {
		this.length = length;
		this.choice = choice;
	}
	
	// Defining the methods of the Square class.
	// Method to print the perimeter of the square.
	public float getPerimeter() {
		return 4*length;
	}
	// Method to print the area of the square.
	public float getArea() {
		return length*length;
	}
	// Method to print the diagonal of the square.
	public float getDiagonal() {
		return (float)Math.sqrt(2*length*length);
	}
	// Method to print any of the chosen parameters.
	public void printParam() {
		if(choice == 1) {
			System.out.println("\nThe diagonal of the square is "
					+ this.getDiagonal()
					+  " units.");
		}else if(choice == 2) {
			System.out.println("\nThe perimeter of the square is "
					+ this.getPerimeter()
					+  " units.");
		}else {
			System.out.println("\nThe area of the square is "
					+ this.getArea()
					+  " units.");
		}
	}
	
}
