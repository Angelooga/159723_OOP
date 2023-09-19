
public class MyStack {
	
	int top; 
	int max;
	char[] stack;
	      
	public MyStack(int max) {
		this.max = max;
		top = 0;
		stack = new char[max];
	}
	
	public void push(char data) {
		if(top == max)
			System.out.println("Stack is full");
		else {
			stack[top] = data;
			top++;
		}
	}
	
	public char pop() {
		
		if(top == 0) {
			System.out.println("The stack is empty");
			return '#';
		}else {
			top--;
			return stack[top];
		}
	}
}
