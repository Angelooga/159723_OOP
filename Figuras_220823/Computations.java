package figures;

public class Computations {

	public static void main(String[] args) {
		// obtaining an instance of the Square class.
		Square mysquare = new Square(159723);
		// obtaining an instance of the Circle class.
		Circle mycircle = new Circle(159723);
		
		System.out.println("Square");
		System.out.println("Perimeter \t" + mysquare.getPerimeter());
		System.out.println("Area \t \t" + mysquare.getArea());
		System.out.println("Diagonal \t" + mysquare.getDiagonal());
		System.out.println("---------------------------");
		System.out.println("Circle");
		System.out.println("Circumference \t" + mycircle.getCircumference());
		System.out.println("Area \t \t" + mycircle.getArea());
	}

}
