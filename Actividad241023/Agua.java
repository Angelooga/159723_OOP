
public class Agua extends Pokemon {
	
	public Agua(String name, String[] ataque, int[] indAtaques) {
		super(name, ataque, indAtaques, 0);
	}
	
	public void verDetalles() {
		System.out.print(this.getNombre() + ": \t Water:\t");
		for(String ataque : this.getAtaques()) {
			System.out.print(" - " + ataque + " - ");
		}
		System.out.println(" ");
	}
}
