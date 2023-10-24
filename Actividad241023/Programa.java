package actividad191023;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public void ejecutar()  throws IOException, ClassNotFoundException {
		
		Jugador player = new Jugador();
		Jugador playerSave = new Jugador();
		Registro info = new Registro(player);
		
		//String path = "C:/Users/angel/OneDrive/Escritorio/Documentos/HWs/OOP/P3actividad191023";
		//String path = "D:/ProgramasJava";
		
		int contadorG, contadorP;
		
		// Este scanner almacena las elecciones del usuario
		Scanner eleccion = new Scanner(System.in);
		
		Menus menu = new Menus();
		int flag = 1;
		
		menu.saludoMenu();
		String nombre = eleccion.nextLine();
		
		File inFile = new File(nombre + ".data");
		
		//Path filePath = Path.of(inFile.getPath());
		
		if(inFile.exists()) {
			player = info.readPlayer(nombre);
			contadorG = player.ganados;
			contadorP = player.perdidos;
			System.out.println("\nBienvenido de vuelta " + nombre + " "
					+ "Aquí están tus estadísticas de tus juegos pasados"
					+ "\nJuegos Ganados: " + contadorG 
					+ "\nJuegos Perdidos: " + contadorP + "\n");
		}else {
			System.out.println("\nVeo que eres nuevo por aquí.\n");
			contadorG = 0;
			contadorP = 0;
		}
		
		do {
			
			menu.premisaInicial(nombre);
			
			Juego juego = new Juego();
			
			int score = juego.iniciarJuego();
			
			if(score == 1) {
				contadorG += 1;
			}else {
				contadorP += 1;
			}
			
			menu.preguntarOtraVez();
			
			try {
				flag = eleccion.nextInt();
			}catch(InputMismatchException e) {
				flag = 0;
			}
			
			
			
		}while(flag != 0);
		
		menu.despedidad();
		
		playerSave.setName(nombre);
		playerSave.setWins(contadorG);
		playerSave.setDefeats(contadorP);
		Registro info2 = new Registro(playerSave);
		
		info2.writePlayer(playerSave.getName());
		
		eleccion.close();
	}
	
}
