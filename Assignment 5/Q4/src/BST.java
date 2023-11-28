import java.util.LinkedList;
import java.util.Queue;

//4. Write recursive function to add node into bst.

public class BST {
	public class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
		
		public int getData() {
			return data;
		}
	}
	
	private Node root;
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void addNode(int value) {
		root = addNodeR(root,value);
	}
	
	public Node addNodeR(Node root, int value) {
		if(root == null)
			return new Node(value);
		if(value < root.data)
					root.left = addNodeR(root.left,value);
		else if(value > root.data)
					root.right = addNodeR(root.right, value);
		
		return root;
	}

	public void BFSTraversal() {
		Queue<Node> q = new LinkedList<BST.Node>();
		q.offer(root);
		System.out.print("BFS Traversal : ");
		while(!q.isEmpty()) {
			Node trav = q.poll();
			System.out.print(" " + trav.data);
			if(trav.left != null)
				q.offer(trav.left);
			if(trav.right != null)
				q.offer(trav.right);
		}
		System.out.println("");
	}
}
