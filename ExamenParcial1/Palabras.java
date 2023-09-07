
public class Palabras {
	
	String sentence;
	
	// Definiendo el método constructor
	public Palabras(String sentence) {
		this.sentence = sentence;
	}
	
	public void primeraMayuscula() {
		// Obteniendo el caracter en el índice 0
		char primeraLetra = sentence.charAt(0);
		String carStr = String.valueOf(primeraLetra);
		// Concatenando la sub-cadena que no contiene la primera letra a la letra mayuscula
		String priMay = carStr.toUpperCase().concat(sentence.substring(1, sentence.length()));
		System.out.println(priMay);
	}
	
	public String invertirCadena() {
		String invertido = "";
		/* Creando un ciclo que recorre la cadena original del final al principio concatenando
		 el caracter en el indice i a la cadena "invertido"*/
		for(int i = sentence.length()-1; i >= 0; i--) {
			char caracter = sentence.charAt(i);
			String caracterString = String.valueOf(caracter);
			invertido = invertido.concat(caracterString);
		}
		// El método regresa la cadena invertida
		return invertido;	
	}
	
	public void vocalesMayusculas() {
		String vocales = "aeiou";
		String vocalesMay = "";
		/* El ciclo compara cada letra de la oración y revisa si se encuentra en las vocales
		 si se encuentra en las vocales entonces la convierte en mayúscula */
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
		// Se obtiene la cadena del método invertir cadena
		String invertido =  this.invertirCadena();
		// Se eliminan los espacios
		invertido = invertido.replace(" ", "");
		// Se compara con la oración original
		if(sentence.replace(" ", "").equals(invertido)) {
			System.out.println("Tu oración/palabra es un palindromo");
		}else {
			System.out.println("Tu oración/palabra no es palindromo");
		}
	}
	
}
