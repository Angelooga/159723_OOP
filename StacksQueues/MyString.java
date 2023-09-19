
public class MyString {
	
	String sentence;
	char[] charArray1, charArray2;
	
	public MyString(String sentence) {
		this.sentence = sentence;
		charArray1 = sentence.toCharArray();
		charArray2 = new char[sentence.length()];
	}
	
	public String invertirString() {
		MyStack stackSentence = new MyStack(charArray1.length);
		
		for(int i = 0; i < charArray1.length; i++) {
			stackSentence.push(charArray1[i]);
		}
		for(int i = 0; i < charArray1.length; i++) {
			charArray2[i] = stackSentence.pop();
		}
		String reversed = String.valueOf(charArray2);
		return reversed;
	}
	
	public void esPalindromo() {
		String invertido =  this.invertirString();
		invertido = invertido.replace(" ", "");
		
		if(sentence.replace(" ", "").equals(invertido)) {
			System.out.println("Tu oración/palabra es un palindromo");
		}else {
			System.out.println("Tu oración/palabra no es palindromo");
		}
	}
	
}
