package ads;

/** 
 * A tree where the left child is <= parent and the right child is > parent
 */
public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
	
	
	BinarySearchTree() {
		
	}
	
	public void add(T t) {
		BinaryNode<T> node = new BinaryNode<T>(t);
		BinaryNode<T> current = root;
		while (true) {
			if (node.getValue().compareTo(current.getValue()) <= 0) {
				if (current.getLeft() == null) {
					current.setLeft(node);
					break;
				} else {
					current = current.getLeft();
				}
			} else {
				if (current.getRight() == null) {
					current.setRight(node);
					break;
				} else {
					current = current.getRight();
				}
			}
		}
	}
	
	public void remove(BinaryNode<T> node) {
		
	}
}
