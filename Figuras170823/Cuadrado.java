import java.lang.Math;

public class Cuadrado {
	public float length;
	
	public Cuadrado(float l) {
		length = l/100;
	}
	
	public float perimetro() {
		return 4*length;
	}
	
	public float area() {
		return length*length;
	}
	
	public float diagonal() {
		return (float) Math.sqrt(2* Math.pow(length, 2));
	}
}
