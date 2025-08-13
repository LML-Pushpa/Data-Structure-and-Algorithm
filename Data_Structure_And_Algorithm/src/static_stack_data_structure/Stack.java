package static_stack_data_structure;

public class Stack {
	public int [] stack;
	public int size;
	public int top;
	
	//Create a Stack and Initialize the size
	public Stack(int size) {
		this.size=size;
		top=-1;
		stack=new int [size];
	}
	
	//Check Condition : Stack is EMPTY
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Check Condition : Stack is FULL
	public boolean isFull() {
		if(top==size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Operation : Push
	public void push(int data) {
		if(!isFull()) {
			top++;
			stack[top]=data;
		}
		else {
			System.out.println("Stack is OverFlow...............!!!!");
		}
	}
	
	//Operation : Pop
	public void pop() {
		int temp=0;
		if(!isEmpty()) {
			temp=stack[top];
			top--;
			System.out.println("Element poped : "+temp);
		}
		else {
			System.out.println("Stack is UnderFlow..................!!!!!!!!");
		}
	}
	
	//Operation : Peek
	public int peek() {
		if(!isEmpty()) {
			return stack[top];
		}
		else {
			System.out.println("Stack is Empty......!!!!!!!!!");
			return -1;
		}
		
	}
	
	//Display
	public void dispaly() {
		if(!isEmpty()) {
			for(int i=top;i>=0;i--) {
				System.out.println("|"+stack[i]+"|");
			}
		}
		else {
			System.out.println("Stack is Empty......................!!!!!");
		}
	}
	

}
