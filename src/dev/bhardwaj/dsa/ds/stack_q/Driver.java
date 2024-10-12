package dev.bhardwaj.dsa.ds.stack_q;

public class Driver {
	public static void main(String args[]) {
//		Stack st = new Stack(4);
//		st.push(20);
//		st.push(30);
//		st.push(10);
//		st.push(40);
//		
//		System.out.println("peek: "+st.peek());
//
//		System.out.println("size: "+st.size());
//		while(!st.isEmpty()) {
//			System.out.println(st.pop());
//		}
		
		
		Queue q = new Queue(4);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
//		q.enqueue(50);
		System.out.println("peek front "+q.peek());
		System.out.println("size: "+q.size());
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
	}
}
