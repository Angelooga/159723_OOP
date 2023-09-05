import java.util.Scanner;

public class Ejecucion {
	
	Scanner oracion = new Scanner(System.in);
	
	public void iniciarPrograma() {
		System.out.println("Por favor introduzca su oración o palabra");
		String usarOracion = oracion.nextLine();
		Palabras oracionUsar = new Palabras(usarOracion);
		
		System.out.println("La oración/palabra inversa es: ");
		String invertida = oracionUsar.invertirCadena();
		System.out.println(invertida + "\n");
		oracionUsar.esPalindromo();
		
	}
}
