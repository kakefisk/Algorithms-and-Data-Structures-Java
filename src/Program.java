import ads.ArrayList;
import ads.BinaryTree;
import ads.BinaryTree.SearchMethod;
import ads.Callback;
import ads.CircularBuffer;
import ads.DoublyLinkedList;
import ads.Graph;
import ads.LinkedList;
import ads.Matrix;

public class Program {

	public static void main(String[] args) {
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		tree.add(5);
		tree.add(1);
		tree.add(20);
		System.out.println(tree.toString(SearchMethod.INORDER));
	}

}
