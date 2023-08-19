import java.lang.Math;

public class Circulo {
	public float radius;
	
	public Circulo(float r) {
		radius = r/100;
	}
	
	public float circunferencia() {
		return (float) (3.141592*radius);
	}
	
	public float areaCalculo() {
		return (float) (3.141592 * (Math.pow(radius, 2)));
	}
}
