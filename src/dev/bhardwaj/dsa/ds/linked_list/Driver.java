package dev.bhardwaj.dsa.ds.linked_list;

public class Driver {
	public static void main(String args[]) {
		SinglyLL ll = new SinglyLL();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addLast(100);
		ll.addLast(200);
		ll.print();
		ll.deleteFirst();
		ll.print();
		ll.deleteLast();
		ll.print();
	}
}
