
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Registro {
	
	Jugador player;
	
	public Registro(Jugador player) {
		this.player = player;
		
	}
	
	public void writePlayer(String name) throws IOException, ClassNotFoundException {
		
		File outFile = new File(name + ".data");
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
		
		outObjectStream.writeObject(player);
		outFileStream.close();
		
	}
	
	public Jugador readPlayer(String name) throws IOException, ClassNotFoundException {
		File inFile = new File(name + ".data");
		FileInputStream inFileStream = new FileInputStream(inFile);
		ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
		
		Jugador jugador = (Jugador) inObjectStream.readObject();
		
		inObjectStream.close();
		
		return jugador;
	}
	
}
