import ads.BinaryTree;
import ads.DoublyLinkedList;
import ads.LinkedList;

public class Program {

	public static void main(String[] args) {
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		for (int i = 0; i < 10; i++) {
			tree.add(i);
		}
		System.out.println(tree.getNode(0));
	}

}
