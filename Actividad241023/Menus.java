package actividad191023;

public class Menus {
	
	public void saludoMenu() {
		System.out.println("Bienvenido a \"Adivina Quién\" versión Pokemón."
				+ "Por favor, introduce tu nombre: ");
	}
	
	public void premisaInicial(String name) {
		System.out.println("\nMuy bien " + name
				+ " ¿Crees que puedas adivinar en qué Pokemón estoy pensando?"
				+ "\nRecuerda que solo tienes 3 intentos para adivinar.\n");
	}
	
	public void preguntaMenu() {
		System.out.println("\nSobre qué te gustaría adivinar?"
				+ "\n1. Elemento"
				+ "\n2. Ataques"
				+ "\nPor favor, selecciona el número indicado\n");
	}
	
	public void elementoPregunta() {
		System.out.println("\nMuy bien, dime, ¿De qué elemento crees que sea el pokemón?"
				+ "\n1. Agua"
				+ "\n2. Fuego"
				+ "\n3. Planta"
				+ "\nPor favor, selecciona el número indicado.\n");
		
	}
	
	public void ataquesPregunta() {
		System.out.println("\nMuy bien, dime, ¿Qué ataque crees que tenga el pokemon?"
				+ "\n1. Hydro Pump"
				+ "\n2. Solar Beam"
				+ "\n3. Eruption"
				+ "\n4. Flamethrower"
				+ "\n5. Aqua Jet"
				+ "\n6. Whirpool"
				+ "\n7. Synthesis"
				+ "\n8. Petal Dance"
				+ "\nPor favor, selecciona el número indicado.\n");
		
	}
	
	public void preguntarOtraVez() {
		System.out.println("\nMuy bien, quieres jugar otra vez?"
				+ "\n0. No, quiero salir!"
				+ "\n1. Sí, quiero seguir jugando!"
				+ "\nPor favor, selecciona el número indicado.");
	}
	
	public void despedidad() {
		System.out.println("Gracias por jugar Adivina Quién versión Pokemón."
				+ "\nHasta Luego!");
	}
	
}
