package ads;

public class BinarySearchTree<T> extends BinaryTree<T> {
	/** 
	 * A tree where the left child is <= parent and the right child is > parent
	 */
	BinarySearchTree() {
		
	}
	
	public void insert(T t) {
		Node<T> node = new Node<T>(t);
		Node<T> current = root;
		while (true) {
			if (node.getValue() <= current.getValue()) {
				
			}
		}
	}
}
