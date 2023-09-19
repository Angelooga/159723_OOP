
public class Programa {
	
	public void ejecutar(){
		
		String myString = "anita lava la tina";
		
		MyString strManipulation = new MyString(myString);
		strManipulation.esPalindromo();
		
		System.out.println("");
		
		MyQueue programa = new MyQueue(5);
		programa.insert('q');
		programa.insert('o');
		programa.insert('t');
		programa.insert('s');
		programa.insert('a');
		
		for(int i = 0; i < 5; i++) {
			char last = programa.delete();
			System.out.println(last);
		}
		
	}
}
