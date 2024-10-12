package dev.bhardwaj.dsa.problems.linked_list;

import dev.bhardwaj.dsa.ds.linked_list.SinglyLL;

public class Driver {
	public static void main(String args[]) {
		
		// using already defined singly ll class. and insert some values
		SinglyLL ll = new SinglyLL();
		ll.addLast(10);
		ll.addLast(20);
		ll.print();
		
		// now, we use insert rec defined in this package's Problem class.
		Problem p = new Problem();
		
		
	}
}
