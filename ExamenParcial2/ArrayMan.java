
import java.util.Random;

public class ArrayMan {
	
	int [] intArray;
	
	public ArrayMan(int[] intArray) {
		this.intArray = intArray;
	}

	public int[] shuffleList() {
		
		int indice, temporal;
		
		Random rnd = new Random();
		
		for(int i = intArray.length - 1; i > 0; i--) {
			
			indice = rnd.nextInt(i + 1);
			temporal = intArray[indice];
			intArray[indice] = intArray[i];
			intArray[i] = temporal;
			
		}
		return intArray;
	}
	
	public Boolean checkItem(int item) {
		
		Boolean flag = false;
		
		for(int i = 0; i < intArray.length; i++) {
			if(item == intArray[i]) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void printArray() {
		for(int item : intArray) {
			System.out.println(item);
		}
	}
	
}
