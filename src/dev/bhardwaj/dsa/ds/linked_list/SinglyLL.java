package dev.bhardwaj.dsa.ds.linked_list;

public class SinglyLL {
	private class Node{
		public int data;
		public Node next;
		public Node(int data) {
			this.data = data;
		}
	}	
	
	
	private Node head;
	private int size;
	
	public SinglyLL() {
		head=null;
		size =0;
	}
	
	public void addFirst(int data) {
		
		Node temp = head;
		
		Node newNode = new Node(data);
		head = newNode;
		
		if(temp!=null) {
			newNode.next = temp;
		}
		
		size++;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			size++;
			return;
		}
		
		Node temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		size++;
	}
	
	public void addAtIndex(int data, int index) {
		if(index==0) {
			addFirst(data);
		}
		
		if(index == size-1) {
			addLast(data);
		}
		
		
	}
	
	public void deleteFirst() {
		if(head==null) {
			return;
		}
		
		head = head.next;
		size--;
	}
	
public void deleteLast() {
		if(head == null) return;
		
		if(size==1) {
			deleteFirst();
			return;
		}
		
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		
		temp.next = null;
		size--;
	}
	
	
	
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+", ");
			temp = temp.next;
		}
		System.out.println();

	}
	
	
	
}
