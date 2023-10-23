
import java.io.*;

public class Jugador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String nombre;
	int ganados;
	int perdidos;
	
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	public String getName() {
		return nombre;
	}
	
	public void setWins(int ganados) {
		this.ganados = ganados;
	}
	public int getWins() {
		return ganados;
	}
	
	public void setDefeats(int perdidos) {
		this.perdidos = perdidos;
	}
	public int getDefeats() {
		return perdidos;
	}
	
}
