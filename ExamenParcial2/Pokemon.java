
public abstract class Pokemon {
	
	private String nombre;
	private String[] ataques;
	private int[] indAtaques;
	private int clase;
	
	public Pokemon(String nombre, String[] ataques, int[] indAtaques, int clase) {
		this.nombre = nombre;
		this.ataques = ataques;
		this.indAtaques = indAtaques;
		this.clase = clase;
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected String[] getAtaques() {
		return ataques;
	}
	protected int[] getIndAtaques() {
		return indAtaques;
	}
	protected int getClase() {
		return clase;
	}
	public abstract void verDetalles();	
}
