
public class Ave extends Animales {
	
	float tamanoPico;
	String tipoPluma;
	
	public Ave(String habitat, int numPatas, float tamano, float tamanoPico, String tipoPluma) {
		super(habitat, numPatas, tamano);
		this.tamanoPico = tamanoPico;
		this.tipoPluma = tipoPluma;
	}
	
	@Override
	public void verDetalles() {
		
		System.out.println("Habitat: " + this.getHabitat()
				+ "\nNúmero de Patas: " + this.getNumPatas()
				+ "\nTamaño:" + this.getTamano()
				+ "\nTamaño del Pico: " + tamanoPico
				+ "\nTipo de Pluma: " + tipoPluma);
		
	}
	
}
