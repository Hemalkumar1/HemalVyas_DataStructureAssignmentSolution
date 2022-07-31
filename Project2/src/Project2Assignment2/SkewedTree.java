package Project2Assignment2;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SkewedTree {
	
	int value;
	Scanner sc = new Scanner(System.in);
	Deque<Node> queue = new LinkedList<Node>();
	
	public class Node {
	int key;
	Node left;
	Node right;
	}
	public Node newNode(int data) {
	Node temp = new Node();
	temp.key = data;
	temp.left = null;
	temp.right = null;
	return temp;
	}
	public Node insertNode(Node root, int key) {
		// Create a new node
		Node newnode = newNode(key);
		if (root == null) {
		root = newnode;
		queue.add(root);
		return root;
		} else {
		Node node;
		node = queue.remove();
//		System.out.println("parent is: " + node.key);
		if (node.left == null) {
		node.left = newnode;
		queue.add(node.left);
		queue.addFirst(node);
		return root;
		} else if (node.right == null) {
		node.right = newnode;
		queue.add(node.right);
		return root;
		}
		}
		return root;
		}
	public void inOrder(Node root) {
	if (root == null) {
//		System.out.print("Program Completed");
		return;
	}
	else {
	inOrder(root.left);
	System.out.print(root.key + " ");
	inOrder(root.right);
	}
	}
}
