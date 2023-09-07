import java.util.Scanner;

public class Ejecucion {
	
	Scanner oracion = new Scanner(System.in);
	Scanner choice = new Scanner(System.in);
	
	public void iniciarPrograma() {
		
		// Esta bandera indica si hay que seguir dentro del ciclo o no
		boolean flag = true;
		do {
			// Haciendo que el usuario introduzca su palabra u oración
			System.out.println("Por favor, introduzca una oración o palabra: ");
			String usarOracion = oracion.nextLine();
			Palabras oracionUsar = new Palabras(usarOracion);
			
			// Mostrando opciones al usuario
			System.out.println("¿Cómo desea manipularla?\n"
					+ "1. Convertir la primera letra en mayúscula\n"
					+ "2. Convertir todas las vocales en mayúsculas\n"
					+ "3. Invertirla\n"
					+ "4. Comprobar si es palíndromo o no\n"
					+ "5. Ejecutar función secreta (Fizz Buzz)\n"
					+ "0. Salir");
			// Guardando la elección del usuario
			String userChoice = choice.nextLine();
			int intChoice = Integer.parseInt(userChoice);
			
			switch(intChoice) {
				case 1:{
					System.out.println("Aquí está tu oración/palabra"
							+ "con la primera letra mayúscula.");
					oracionUsar.primeraMayuscula();
					break;
				}
				case 2:{
					System.out.println("Aquí está tu oración/palabra"
							+ "con las vocales mayúsculas.");
					oracionUsar.vocalesMayusculas();
					break;
				}
				case 3:{
					System.out.println("Aquí está tu oración/palabra invertida.");
					String invertida = oracionUsar.invertirCadena();
					System.out.println(invertida + "\n");
					break;
				}
				case 4:{
					oracionUsar.esPalindromo();
					break;
				}
				case 5:{
					new Extra().fizzBuzz();
				}
				default:{
					System.out.println("Thank you using our programm");
					flag = false;
					break;
				}
			}
		}while(flag);
		
		oracion.close();
		choice.close();
	}
}
