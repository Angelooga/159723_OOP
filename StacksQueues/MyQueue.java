
public class MyQueue {

	int max;
	int tail;
	char[] queue;
	
	public MyQueue(int max) {
		this.max = max;
		queue = new char[max];
	}
	
	public void insert(char data) {
		if(tail == max) {
			System.out.println("Queue is full");
		}else {
			queue[tail] = data;
			tail++;
		}
	}
	
	public char delete() {
		
		if(tail == 0) {
			System.out.println("The queue is empty");
			return '#';
		}else {
			tail--;
			return queue[max - tail - 1];
		}
	}
}
