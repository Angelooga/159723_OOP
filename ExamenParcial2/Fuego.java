package examenIntento2;

public class Fuego extends Pokemon {

	public Fuego(String name, String[] ataque, int[] indAtaques) {
		super(name, ataque, indAtaques, 1);
	}
	
	public void verDetalles() {
		System.out.print(this.getNombre() + ": \t Fire:\t");
		for(String ataque : this.getAtaques()) {
			System.out.print(" - " + ataque + " - ");
		}
		System.out.println(" ");
	}
	
}
