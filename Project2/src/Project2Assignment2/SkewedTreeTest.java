package Project2Assignment2;

import Project2Assignment2.SkewedTree.Node;

public class SkewedTreeTest {

	public static void main(String[] args) {
		SkewedTree tree = new SkewedTree();
		
		Node root = null;
		root = tree.insertNode(root, 50);
		tree.inOrder(root);
		root = tree.insertNode(root, 30);
		tree.inOrder(root);
		root = tree.insertNode(root, 60);
		tree.inOrder(root);
		root = tree.insertNode(root, 10);
		tree.inOrder(root);
		root = tree.insertNode(root, 55);
		tree.inOrder(root);
		
		
		

	}

}
