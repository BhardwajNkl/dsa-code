package dev.bhardwaj.dsa.ds.linked_list;

public class DoublyLL {
	private class Node{
		public int data;
		public Node next;
		public Node prev;
		public Node(int data) {
			this.data = data;
		}
	}	
	
	private Node head;
	private int size;
	
	public DoublyLL() {
		head=null;
		size =0;
	}
	
	public void addFirst(int data) {
		if(head==null) {
			head = new Node(data);
			size++;
			return;
		}
		
		Node newNode = new Node(data);
		
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		
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
		newNode.prev = temp;
		
		size++;
	}
	
	public void addAtIndex(int index, int data) {
		if(index>size || index<0) {
			System.out.println("invalid index!");
			return;
		}
		if(index==0) {
			addFirst(data);
			return;
		}
		
		if(index == size) {
			addLast(data);
			return;
		}
		
		// to add at index i means, get i-1th node then add new node next to it.
		Node temp = head;
		int i=0; // indicating that currently on 0th node that is head.
		while(i<index-1) { // when exit, i will be index-1 and temp will be right here.
			temp = temp.next;
			i++;
		}
		
		Node newNode = new Node(data);
		
		newNode.next = temp.next;
		temp.next.prev = newNode;
		newNode.prev = temp;
		
		temp.next = newNode;
		
		size++;
		
	}
	
	public void deleteFirst() {
		if(head==null) {
			return;
		}
		
		head = head.next;
		head.prev = null;
		
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
	
	public int size() {
		return size;
	}
	
	
	
}
