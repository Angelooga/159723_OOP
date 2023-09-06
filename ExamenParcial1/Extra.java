
public class Extra {

	public void fizzBuzz() {
		for(int i = 1; i < 100; i++) {
			if(i%15 == 0 ) {
				System.out.println("fizz buzz");
				continue;
			}else if(i%3 == 0) {
				System.out.println("fizz");
				continue;
			}else if(i%5 == 0) {
				System.out.println("buzz");
				continue;
			}
			System.out.println(i);
		}
	}
	
}
