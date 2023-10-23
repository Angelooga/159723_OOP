
public class Planta extends Pokemon {
	
	public Planta(String name, String[] ataque, int[] indAtaques) {
		super(name, ataque, indAtaques, 2);
	}
	
	public void verDetalles() {
		System.out.print(this.getNombre() + ": \t Grass:\t");
		for(String ataque : this.getAtaques()) {
			System.out.print(" - " + ataque + " - ");
		}
		System.out.println(" ");
	}
}
