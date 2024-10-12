package dev.bhardwaj.dsa.ds.stack_q;
// array based impl
public class Stack {
	private int data[];
	private static final int DEFAULT_CAPACITY=10;
	private int size; // not really needed. but a good practice. we could get the size by using the top pointer itself.
	private int top;
	
	public Stack() {
		this(DEFAULT_CAPACITY);
	}
	
	public Stack(int capacity) {
		data = new int[capacity];
		top=-1;
	}
	
	// push
	public void push(int val) {
		// check if full
		if(isFull()) {
			throw new RuntimeException("stack full");
		}
		
		// before push do top+1
		top++;
		data[top]=val;
		size++;
	}
	
	// pop
	public int pop() {
		// check if empty
		if(isEmpty()) {
			throw new RuntimeException("stack empty");
		}
		
		// remove top element. can be acheived by simply decreasing the top pointer.
		int val = data[top];
		top--;
		size--;
		return val;
	}
	
	// peek
		public int peek() {
			// check if empty
			if(isEmpty()) {
				throw new RuntimeException("stack empty");
			}
			
			return data[top];
		}
	
	// isEmpty
	public boolean isEmpty() {
		return size==0;
	}
	
	// isFull
	public boolean isFull() {
		return size==data.length;
	}
	
	// size
	public int size() {
		return size;
	}
}
