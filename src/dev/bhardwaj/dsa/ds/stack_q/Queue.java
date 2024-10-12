package dev.bhardwaj.dsa.ds.stack_q;

public class Queue {
	private int data[];
	private static final int DEFAULT_CAPACITY=10;
	private int size; // not really needed. but a good practice. we could get the size by using the top pointer itself.
	private int front;
	private int rear;
	
	public Queue() {
		this(DEFAULT_CAPACITY);
	}
	
	public Queue(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
	}
	
	// enqueue
	public void enqueue(int val) {
		// check if full
		if(isFull()) {
			throw new RuntimeException("queue full");
		}
		
		// first increment rear then insert on rear
		rear++;
		data[rear]=val;
		if(front==-1) front=0;
		
		size++;
		
	}
	
	// dequeue
	public int dequeue() {
		// check if empty
		if(isEmpty()) {
			throw new RuntimeException("Queue empty");
		}
		
		// get element from front. then shift all elements from front+1 index by 1 position left.
		int val = data[front];
		for(int i=1;i<=rear;i++) {
			data[i-1] = data[i];
		}
		
		rear--;
		if(rear==-1) front=-1;
		
		size--;
		
		return val;
	}
	
	// peek
		public int peek() {
			// check if empty
			if(isEmpty()) {
				throw new RuntimeException("Queue empty");
			}
			
			return data[front];
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
