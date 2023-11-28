
public class Tester {
	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(13);
//		bst.inorder();
//		bst.deleteNode(8);
//		bst.inorder();
//		bst.countLeafNode();
//		bst.countNonLeafNode();
		bst.parentOfGivenNode(8);
		bst.parentOfGivenNode(3);
		bst.parentOfGivenNode(10);
		bst.parentOfGivenNode(1);
		bst.parentOfGivenNode(6);
		bst.parentOfGivenNode(14);
		bst.parentOfGivenNode(4);
		bst.parentOfGivenNode(7);
		bst.parentOfGivenNode(13);
	}
}
