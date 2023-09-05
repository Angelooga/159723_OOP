
public class Palabras {
	
	String sentence;
	
	// Definiendo el método constructor
	public Palabras(String sentence) {
		this.sentence = sentence;
	}
	
	/*public void primeraMayuscula() {
		
	}*/
	
	public String invertirCadena() {
		String invertido = "";
		int lengthSentence = sentence.length();
		
		for(int i = lengthSentence-1; i >= 0; i--) {
			char caracter = sentence.charAt(i);
			String caracterString = String.valueOf(caracter);
			invertido = invertido.concat(caracterString);
		}
		return invertido;	
	}
	
	public void esPalindromo() {
		String invertido =  this.invertirCadena();
		invertido = invertido.replace(" ", "");
		if(sentence.replace(" ", "").equals(invertido)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
	}
	
}
