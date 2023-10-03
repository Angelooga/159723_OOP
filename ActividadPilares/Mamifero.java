
public class Mamifero extends Animales {
	
	Boolean conPelaje;
	String dieta;
	
	public Mamifero(String habitat, int numPatas, float tamano,Boolean conPelaje, String dieta) {
		super(habitat, numPatas, tamano);
		this.conPelaje = conPelaje;
		this.dieta = dieta;
		
	}

	@Override
	public void verDetalles() {
		
		System.out.println("Habitat: " + this.getHabitat()
				+ "\nNúmero de Patas: " + this.getNumPatas()
				+ "\nTamaño:" + this.getTamano() + "m"
				+ "\nTiene Pelaje: " + conPelaje
				+ "\nDieta: " + dieta);
		
	}
	
	
}
