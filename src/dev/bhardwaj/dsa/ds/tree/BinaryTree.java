package dev.bhardwaj.dsa.ds.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		public int data;
		public Node left;
		public Node right;

		Node(int data) {
			this.data = data;
		}

	}

	private Node root;

	public BinaryTree() {

	}

//	public void insert(int data) {
//		Node newNode = new Node(data);
//		root = newNode;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Left child of " + data + ": ");
//		int leftData = sc.nextInt();
//		if(leftData>0)
//		newNode.left = insert(newNode.left, leftData);
//
//		System.out.print("right child of " + data + ": ");
//		int rightData = sc.nextInt();
//		if(rightData>0)
//		newNode.right = insert(newNode.right, rightData);
//	}
//	
//	public Node insert(Node node, int data) {
//		Node newNode = new Node(data);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Left child of " + data + ": ");
//		int leftData = sc.nextInt();
//		if(leftData>0)
//		newNode.left = insert(newNode.left, leftData);
//
//		System.out.print("right child of " + data + ": ");
//		int rightData = sc.nextInt();
//		if(rightData>0)
//		newNode.right = insert(newNode.right, rightData);
//		
//		return newNode;
//	}

	public Node getRoot() {
		return root;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		root = newNode;
		insertHelper(root);
	}

	private void insertHelper(Node node) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Left child of " + node.data + ": ");
		int leftData = sc.nextInt();
		if (leftData > 0) {
			node.left = new Node(leftData);
			insertHelper(node.left);
		}

		System.out.print("right child of " + node.data + ": ");
		int rightData = sc.nextInt();
		if (rightData > 0) {
			node.right = new Node(rightData);
			insertHelper(node.right);
		}
	}

	public void preOrder(Node node) {
		if(node==null) return;
		// node-left-right
		System.out.print(node.data+", ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder(Node node) {
		if(node==null) return;
		// left-node-right
		inOrder(node.left);
		System.out.print(node.data+", ");
		inOrder(node.right);
	}

	public void postOrder(Node node) {
		if(node==null) return;
		// left-right-node
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+", ");

	}
	
	public void levelOrder(Node node) {
		if(node==null) return;
		levelOrderHelper(Arrays.asList(node));
	}
	
	private void levelOrderHelper(List<Node> levelNodes) {
		// 1. print current level. and 2. form next level.
		List<Node> nextLevel = new ArrayList<>();
		
		for(Node n: levelNodes) {
			System.out.print(n.data+", ");
			if(n.left!=null) nextLevel.add(n.left);
			if(n.right!=null) nextLevel.add(n.right);
		}
		
		System.out.println();
		if(nextLevel.size()>0)
		levelOrderHelper(nextLevel);
				
	}
	
	public void levelOrderUsingQ() {
		// TO RETURN LIST OF LISTS OF EACH LEVEL VALUE, WE CAN USE LEVELsIZE VARIABLE. AND FOR EACH LEVEL WE SAVE VALUES IN A LIST.
		
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			// dequeue and print
			Node front = q.poll();
			System.out.print(front.data+", ");
			
			// enqueue the children of currently printed node
			if(front.left!=null) q.add(front.left);
			if(front.right!=null) q.add(front.right);
		}
	}

}
