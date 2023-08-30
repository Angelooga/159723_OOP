package createFigures;

public class Menus {
	boolean flag;
	
	public void welcomeMenu(boolean flag) {
		// This method prints the initial menu.
		if(!flag) {
			System.out.println("Welcome to the figure generator!");
		}
		System.out.println("\nPlease, choose the figure you want to create.");
		System.out.println("1. Square\n" 
				+ "2. Circle\n");
	}
	public void askLength() {
		// This method prints the prompt to ask the user the square length.
		System.out.println("\nYou chose Square! "
				+ "Please, introduce the length of the square sides.\n");
	}
	public void askRadius() {
		// This method prints the prompt to ask the user the circle radius.
		System.out.println("\nYou chose Circle! "
				+ "Please, introduce the length of the circle radius.\n");
	}
	public void squareMenu() {
		// This method prints the menu corresponding to the square characteristics.
		System.out.println("\nWhat would you like to calculate?");
		System.out.println("1. The Square diagonal\n"
				+ "2. The Square perimeter\n"
				+ "3. The Square area\n");
	}
	public void circleMenu() {
		// This method prints the menu corresponding to the square characteristics.
		System.out.println("\nWhat would you like to calculate?");
		System.out.println("1. The Circle circumference\n"
				+ "2. The Circle area\n");
	}
	public void askAgain() {
		// This method prints the prompt to ask whether the user wants to create
		// another figure.
		System.out.println("\nWould you like to try again?\n"
				+ "Press 1 to continue.\n"
				+ "Press 0 to quit\n");
	}
}
