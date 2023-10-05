
import java.util.Scanner;
import java.util.Random;

public class Ejecutar {

	public void iniciarPrograma() {
		
		// Este random es para asignar el pokemon a ser adivinado
		Random assign = new Random();
		// Este scanner almacena las elecciones del usuario
		Scanner eleccion = new Scanner(System.in);
		// Este scanner almacena la última elección del usuario
		Scanner eleccionFinal = new Scanner(System.in);
		// Este objeto despliega menús
		Menus menu = new Menus();
		
		// Arreglo para almacenar pokemones
		Pokemon[] pokeLista = new Pokemon[15];
		int[] pokeClases = {0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2};
		
		// Estos contadores es para ir asignando los pokemones a cada clase
		int contadorA = 0;
		int contadorF = 0;
		int contadorP = 0;
		// Índice de los ataques
		int[] indiceAtaque = {0,1,2,3,4,5,6,7};
		ArrayMan randomAtaque = new ArrayMan(indiceAtaque);
		
		// Nombres y ataques de los pokemon
		String[] agua = {"Squirtle", "Totodile", "Mudkip", "Froakie", "Quaxly"};
		String[] fuego = {"Charmander", "Cyndaquil", "Torchic", "Litten", "Fuecoco"};
		String[] planta = {"Bulbasaur", "Chikorita", "Treecko", "Rowlet", "Sprigatito"};
		String[] ataques = {"Hydro Pump", "Solar Beam", "Eruption", "Flamethrower", "Aqua Jet",
				"Whirpool", "Synthesis", "Petal Dance"};
		
		// Nombre del pokemon a adivinar
		String pokemonAdivinar;
		
		Boolean[] pokemonesImprimir = {true,true,true,true,true,true,true,true,true,true,true,
				true,true,true,true};
		
		menu.saludoMenu();
		
		for(int j = 0; j < pokeLista.length; j++) {
			
			indiceAtaque = randomAtaque.shuffleList();
					
			// Guardando los ataque escogidos aleatoriamente y sus indices
			String [] arrAtaque = new String[4];
			int [] indAtaque = new int[4];
					
			// Generando cuatro ataques aleatorios
			for(int i = 0; i < 4; i++) {
				arrAtaque[i] = ataques[indiceAtaque[i]];
				indAtaque[i] = indiceAtaque[i];
			}
			
			int choice = pokeClases[j];
			
			// Generando los pokemones dependiendo de sus clases 0, 1 o 2 
			if(choice == 0) {
				pokeLista[j] = new Agua(agua[contadorA], arrAtaque, indAtaque);
				pokeLista[j].verDetalles();
				contadorA += 1;
			}else if(choice == 1) {
				pokeLista[j] = new Fuego(fuego[contadorF], arrAtaque, indAtaque);
				pokeLista[j].verDetalles();
				contadorF += 1;
			}else {
				pokeLista[j] = new Planta(planta[contadorP], arrAtaque, indAtaque);
				pokeLista[j].verDetalles();
				contadorP += 1;
			}
		}
		
		// Escogiendo cualquier pokemon aleatorio
		int indiceAdivinar = assign.nextInt(15);
		pokemonAdivinar = pokeLista[indiceAdivinar].getNombre();
		int[] adivinarAtaques = pokeLista[indiceAdivinar].getIndAtaques();
	
		
		// Esta bandera indica cuando el ciclo se tenga que romper
		int flag = 0;
		
		do {
			
			menu.preguntaMenu();
			/*
			 * Este número tiene que ver con lo que el usuario quiere adivinar, si algún ataque
			 * o el elemento
			 */
			int intEleccion = eleccion.nextInt() - 1;
			
			if(intEleccion == 0) {
				
				//Si el usuario quiso adivinar el elemento, se ingresa a este bloque
				menu.elementoPregunta();
				// Elección del elemento
				intEleccion = eleccion.nextInt() - 1; 
				
				// Se compara el elemento adivinado con el elemento del pokemon a adivinar
				if(intEleccion == pokeLista[indiceAdivinar].getClase()) {
					System.out.println("\nEs correcto, el pokemón es de ese elemento "
							+ "que dices.\n");
					
					for(int i = 0; i < pokeLista.length; i++) {
						// Si el pokemon es del elemento escogido, el valor de verdad de los
						// pokemones que no son de sete elemento se establecerá como falso 
						// para que no se impriman
						if(!(intEleccion == pokeLista[i].getClase())) {
							pokemonesImprimir[i] = false;
						}
					}
					
				}else {
					System.out.println("\nNo!, el pokemón no es de ese elemento que dices.\n");
					
					for(int i = 0; i < pokeLista.length; i++) {
						// Si el pokemon no es del elemento escogido, el valor de verdad
						// de los que sean del mismo elemento será falso para que 
						// no se impriman
						if(intEleccion == pokeLista[i].getClase()) {
							pokemonesImprimir[i] = false;
						}
					}
				}	
			}else if(intEleccion == 1) {
				
				// Creación de un objeto para manipular el arreglo adivinarAtaques
				ArrayMan checkAtaques = new ArrayMan(adivinarAtaques);
				
				//Si el usuario quiso adivinar el ataque, se ingresa a este bloque
				menu.ataquesPregunta();
				// Elección del ataque
				intEleccion = eleccion.nextInt() - 1;
				
				if(checkAtaques.checkItem(intEleccion)) {
					System.out.println("\nEs correcto, el pokemón tiene ese ataque que dices.\n");
					
					for(int i = 0; i < pokeLista.length; i++) {
						ArrayMan eliminarAtaques = new ArrayMan(pokeLista[i].getIndAtaques());
						// Si el pokemon contiene el ataque escogido, el valor de verdad se
						// de los que no lo  tengan se establecerá como falso para que 
						// no se impriman
						if(!(eliminarAtaques.checkItem(intEleccion))) {
							pokemonesImprimir[i] = false;
						}
					}
					
				}else {
					
					System.out.println("\nNo!, el pokemón no tiene ese ataque que dices.\n");
					for(int i = 0; i < pokeLista.length; i++) {
						// Si el pokemon no contiene el ataque escogido, el valor de verdad
						// de los que compartan el ataque escogido será falso para que 
						// no se impriman
						ArrayMan eliminarAtaques = new ArrayMan(pokeLista[i].getIndAtaques());
						if(eliminarAtaques.checkItem(intEleccion)) {
							pokemonesImprimir[i] = false;
						}
					}
				}
			}
			
			for(int i = 0; i < pokeLista.length; i++) {
				// imprimiendo la lista verificando que no tengan atributos falsos
				if(pokemonesImprimir[i]) {
					pokeLista[i].verDetalles();
				}
			}
			
			flag += 1;
			
			if(flag == 3) {
				System.out.println("\nMuy bien, es suficiente, "
						+ "¿En qué Pokémon crees que estoy pensando?"
						+ "\nPor favor, escribe el nombre del pokemón tal y como se muestra.\n");
				
				// Almacenando la conjetura del usuario
				String finalChoice = eleccionFinal.nextLine();
				
				// Comparando la conjetura con el pokemon a adivinar
				if(finalChoice.equals(pokemonAdivinar)) {
					System.out.println("\nEs correcto, estaba pensando en "
							+ pokemonAdivinar + " ¡¡¡Has Ganado!!!");
				}else {
					System.out.println("\nTe has equivocado!, estaba pensando en "
							+ pokemonAdivinar + " ¡¡¡Yo He Ganado!!!");
				}
				
			}
			
		}while(flag < 3);
		
	}
	
}
