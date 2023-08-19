
public class Calculos {

	public static void main(String[] args) {
		
		Cuadrado cuadrado1 = new Cuadrado(159723);
		Circulo circulo1 = new Circulo(159723);
		
		System.out.println("Cuadrado");
		System.out.println("Perímetro \t" + cuadrado1.perimetro());
		System.out.println("Área \t \t" + cuadrado1.area());
		System.out.println("Diagonal \t" + cuadrado1.diagonal());
		System.out.println("---------------------------");
		System.out.println("Círculo");
		System.out.println("Circunferencia \t" + circulo1.circunferencia());
		System.out.println("Área \t \t" + circulo1.areaCalculo());
	}

}
