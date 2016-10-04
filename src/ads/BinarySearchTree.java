package ads;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
	/** 
	 * A tree where the left child is <= parent and the right child is > parent
	 */
	BinarySearchTree() {
		
	}
	
	public void insert(T t) {
		BinaryNode<T> node = new BinaryNode<T>(t);
		BinaryNode<T> current = root;
		while (true) {
			if (node.getValue().compareTo(current.getValue()) <= 0) {
				
			}
		}
	}
}
