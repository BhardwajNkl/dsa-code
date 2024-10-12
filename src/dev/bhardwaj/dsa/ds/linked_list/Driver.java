package dev.bhardwaj.dsa.ds.linked_list;

public class Driver {
	public static void main(String args[]) {
//		SinglyLL ll = new SinglyLL();
//		ll.addFirst(10);
//		ll.addFirst(20);
//		ll.addFirst(30);
//		ll.addLast(100);
//		ll.addLast(200);
////		ll.print();
////		ll.deleteFirst();
////		ll.print();
////		ll.deleteLast();
////		ll.print();
//		
////		ll.addAtIndex(3,700);
//		ll.print();
//		System.out.println(ll.size());
		
		
		// DOUBLY
		
//		DoublyLL ll = new DoublyLL();
//		ll.addFirst(10);
//		ll.addFirst(20);
//		ll.addLast(30);
//		ll.addLast(40);
//		ll.print();
//		ll.addAtIndex(5, 700);
//		ll.print();
		
		SinglyLL ll = new SinglyLL();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(100);
		ll.addLast(200);
//		
		ll.print();
//		
//		ll.insertRec(334, 2);
//		ll.print();
		
		ll.reverse();
		ll.print();
		
	}
}
