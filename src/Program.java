import ads.ArrayList;
import ads.BinaryTree;
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
		tree.traverse(BinaryTree.SearchMethod.BREADTH_FIRST, new Callback() {
			@Override
			public void execute(Object o) {
				System.out.println("" + o + "\n");
			}
		});
	}

}
