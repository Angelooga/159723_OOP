package createFigures;
import java.util.Scanner;

public class Program {
	
	public void executeProgram() {
		
		// Initializing the instances that will store the inputs
		Scanner initialChoice = new Scanner(System.in);
		Scanner figureParam = new Scanner(System.in);
		Scanner calcChoice = new Scanner(System.in);
		
		// Printing the welcome menu
		new Menus().welcomeMenu();
		
		// Obtaining the choice input from the user
		String inChoice = initialChoice.nextLine();
		int scannedChoice = Integer.parseInt(inChoice);
		
		if(scannedChoice == 1) {
			
			// Printing the prompt that ask the user the square length
			new Menus().askLength();
			// Obtaining the length choice from the user
			String figParam = figureParam.nextLine();
			int scannedParam = Integer.parseInt(figParam);
			
			// Printing the square menu
			new Menus().squareMenu();
			// Obtaining the decision from the user
			String calChoice = calcChoice.nextLine();
			int scannedCalc = Integer.parseInt(calChoice);
			
			Square mySquare = new Square((float)scannedParam, scannedCalc);
			mySquare.printParam();
			
		}else {
			
			// Printing the prompt that ask the user the circle radius
			new Menus().askRadius();
			// Obtaining the length choice from the user
			String figParam = figureParam.nextLine();
			int scannedParam = Integer.parseInt(figParam);
			
			// Printing the circle menu
			new Menus().circleMenu();
			// Obtaining the decision from the user
			String calChoice = calcChoice.nextLine();
			int scannedCalc = Integer.parseInt(calChoice);
			
			Circle myCircle = new Circle((float)scannedParam, scannedCalc);
			myCircle.printParam();
			
		}
		
		initialChoice.close();
		figureParam.close();
		calcChoice.close();
		
	}
	
}
