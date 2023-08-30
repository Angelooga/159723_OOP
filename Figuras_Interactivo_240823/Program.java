package createFigures;
import java.util.Scanner;

public class Program {
	
	public void executeProgram() {
		// This flag indicates whether the loop will keep going or not
		boolean flag = false;
		
		// Initializing the instances that will store the inputs
		Scanner initialChoice = new Scanner(System.in);
		Scanner figureParam = new Scanner(System.in);
		Scanner calcChoice = new Scanner(System.in);
		Scanner againChoice = new Scanner(System.in);
		
		do {
			// Printing the welcome menu
			// The parameter is used deploy or not the welcome prompt
			new Menus().welcomeMenu(flag);
			
			// Obtaining the choice input from the user
			String inChoice = initialChoice.nextLine();
			int scannedChoice = Integer.parseInt(inChoice);
			
			switch(scannedChoice){
				case 1:{
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
					break;
				}
				case 2:{
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
					break;
				}
				default:{
					System.out.println("Please, choose a valid option...");
					break;
				}
			}
			// Asking the user if he wants to repeat the process
			new Menus().askAgain();
			// Storing the user's input
			String agaChoice = againChoice.nextLine();
			int scanChoice = Integer.parseInt(agaChoice);
			
			// Changing the flag variable to see if loop should end or not
			if(scanChoice == 1) {
				flag = true;
			}else {
				flag = false;
			}
			
		}while(flag);
		// Printing the gratitude message
		System.out.println("Thanks for using UDLAP's figure generator! ");
		
		initialChoice.close();
		figureParam.close();
		calcChoice.close();
		againChoice.close();
	}
	
}
