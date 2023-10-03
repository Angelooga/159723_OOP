
public class Pez extends Animales {

	int nAletas;
	float profundidad;
	
	public Pez(String habitat, int numPatas, float tamano, int nAletas, float profundidad) {
		super(habitat, numPatas, tamano);
		this.nAletas = nAletas;
		this.profundidad = profundidad;
	}
	
	@Override
	public void verDetalles() {
		
		System.out.println("Habitat: " + this.getHabitat()
				+ "\nNúmero de Patas: " + this.getNumPatas()
				+ "\nTamaño:" + this.getTamano()
				+ "\nNúmero de Aletas: " + nAletas
				+ "\nSe encuentra a: " + profundidad + "km de Profundidad.");
		
	}
	
}
