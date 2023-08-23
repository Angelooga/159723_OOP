package figures;
import java.lang.Math;

public class Square {
	
	// Defining the Square class attribute "length".
	public float length;
	
	// Creating the Square constructor.
	// In this case, "this" is used to set the attribute apart from the local variable.
	public Square(float length) {
		this.length = length/100;
	}
	
	// Here, we assign a default value, using the "this" keyword, to the length attribute.
	public Square() {
		this(159723/100);
	}
	
	// Defining the methods of the square class.
	public float getPerimeter() {
		return 4*length; 
	}
	public float getArea() {
		return length*length;
	}
	public float getDiagonal() {
		return (float)Math.sqrt(2*length*length);
	}
}
