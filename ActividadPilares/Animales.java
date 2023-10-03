
public abstract class Animales {
	
	private String habitat;
	private int numPatas;
	private float tamano;
	
	public Animales(String habitat, int numPatas, float tamano) {
		
		this.habitat = habitat;
		this.numPatas = numPatas;
		this.tamano = tamano;
		
	}
	
	public String getHabitat() {
		return habitat;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public float getTamano() {
		return tamano;
	}
	public abstract void verDetalles();
	
}
