//5. Write recursive function to perfrom search operation in bst.

public class BST {
	public class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
}
