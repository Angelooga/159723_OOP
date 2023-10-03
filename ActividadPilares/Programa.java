import java.util.Random;

public class Programa {

	public void ejecutar() {
		
		Random assign = new Random();
		Random randChar = new Random();
		
		// Lista de animales
		Animales[] aniLista = new Animales[10];
		
		// Para los atributos de Animales
		int[] numPatas = {0, 2, 4};
		String[] habitats = {"Selva", "Bosque", "Océano Pacífico", "Océano Atlántico", "Ciudad",
				"Desierto", "Oceano Índico", "Oceano Ártico"};
		float[] tamaños = new float[20];
		
		// Para los atributos de Mamifero
		// Boolean[] pelaje = {false, true};
		String[] dietas = {"Herbívoro", "Carnívoro", "Omnívoro"};
		
		// Para los atributos de Ave
		float[] tamañosPico = new float[10];
		String[] tipoPlumas = {"Pluma de Contorno", "Semipluma", "Plumón", "Cerda", "Fitopluma"};
		
		// Para los atributos de Pez
		int[] nAletas = {3, 4, 5, 6, 7};
		float[] profundidades = new float[10];
		
		// Asignando valores a la lista tamaños
		for(int i = 0; i < 20; i++) {
			
			float tam = 0.5f;
			
			tamaños[i] = tam;
			
			tam = tam + 0.1f;
		}
		
		// Asignando valores a las listas de atributos tamañosPico y profundidades
		for(int i = 0; i < 10; i++) {
			
			float tpico = 0.05f;
			float prof = 0.5f;
			
			tamañosPico[i] = tpico;
			profundidades[i] = prof;
			
			tpico = tpico + 0.05f;
			prof = prof + 0.5f;
		}
		
		for(Animales animal : aniLista) {
			
			System.out.println(" ");
			
			int choice = assign.nextInt(3);
			if(choice == 0) {
				
				animal = new Mamifero(habitats[randChar.nextInt(8)], numPatas[randChar.nextInt(3)], 
						tamaños[randChar.nextInt(20)], randChar.nextBoolean(), 
						dietas[randChar.nextInt(3)]);
				animal.verDetalles();
				
			}else if(choice == 1) {
				
				animal = new Ave(habitats[randChar.nextInt(8)], numPatas[randChar.nextInt(3)], 
						tamaños[randChar.nextInt(20)], tamañosPico[randChar.nextInt(10)], 
						tipoPlumas[randChar.nextInt(5)]);
				animal.verDetalles();
				
			}else{
				
				animal = new Pez(habitats[randChar.nextInt(8)], numPatas[randChar.nextInt(3)], 
						tamaños[randChar.nextInt(20)], nAletas[randChar.nextInt(5)], 
						profundidades[randChar.nextInt(10)]);
				animal.verDetalles();
				
			}
			System.out.println(" ");
		}
	}
}
