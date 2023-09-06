
public class Palabras {
	
	String sentence;
	
	// Definiendo el método constructor
	public Palabras(String sentence) {
		this.sentence = sentence;
	}
	
	public void primeraMayuscula() {
		char primeraLetra = sentence.charAt(0);
		String carStr = String.valueOf(primeraLetra);
		String priMay = carStr.toUpperCase().concat(sentence.substring(1, sentence.length()));
		System.out.println(priMay);
	}
	
	public String invertirCadena() {
		String invertido = "";
		
		for(int i = sentence.length()-1; i >= 0; i--) {
			char caracter = sentence.charAt(i);
			String caracterString = String.valueOf(caracter);
			invertido = invertido.concat(caracterString);
		}
		return invertido;	
	}
	
	public void vocalesMayusculas() {
		
		String vocales = "aeiou";
		String vocalesMay = "";
		
		for(int i = 0; i < sentence.length(); i++) {
			char caracter = sentence.charAt(i);
			String carStr = String.valueOf(caracter);
			if(vocales.contains(carStr)) {
				vocalesMay = vocalesMay.concat(carStr.toUpperCase());
			}else {
				vocalesMay = vocalesMay.concat(carStr);
			}
		}
		System.out.println(vocalesMay);
		
	}
	
	public void esPalindromo() {
		String invertido =  this.invertirCadena();
		invertido = invertido.replace(" ", "");
		if(sentence.replace(" ", "").equals(invertido)) {
			System.out.println("Tu oración/palabra es un palindromo");
		}else {
			System.out.println("Tu oración/palabra no es palindromo");
		}
	}
	
}
