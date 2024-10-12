package dev.bhardwaj.dsa.ds.tree;

public class Driver {
	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
		bt.insert(10); // insert the root. then it recursively asks for child nodes.
		
		System.out.println("\npreorder");
		bt.preOrder(bt.getRoot());
		System.out.println("\ninorder");
		bt.inOrder(bt.getRoot());
		System.out.println("\npostorder");
		bt.postOrder(bt.getRoot());
		
		System.out.println("\nlevel order");
		bt.levelOrder(bt.getRoot());
		System.out.println("\nlevel order using queue");
		bt.levelOrderUsingQ();
	}
}
