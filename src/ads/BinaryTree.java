package ads;

/** A tree datastructure where each node have at maximum two children nodes.
 *
 */
public class BinaryTree<T> {
	
	protected BinaryNode<T> root = null;
	private int size = 0;
	public enum SearchMethod {BREADTH_FIRST, POST_ORDER, INORDER, PRE_ORDER};
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	
	/** Adds a new element at the first empty position.
	 * @param object The object to add to the tree.
	 */
	public void add(T object) {
		BinaryNode<T> node = new BinaryNode<T>(object);
		if (root == null) {
			root = node;
		} else {
			
		}
	}
	
	/** Adds a new object at the given position.
	 * @param pos 
	 * @param object The object to add to the tree.
	 */
	public void insert(int pos, T object) {
		BinaryNode<T> node = new BinaryNode<T>(object);
		if (root == null) {
			root = node;
		} else {
			
		}
	}
	
	public T getAt(int pos) {
		return getNode(pos).getValue();
	}
	
	public BinaryNode<T> getNode(int pos) {
		if (isEmpty() || pos < 0) return null;
		BinaryNode<T> current = root;
		int i = 0;
		int bit = 0;
		while (bit <= pos) {
			bit = pos & (1 << i);
			if (bit != 0) {
				current = root.getRight();
			} else {
				current = root.getLeft();
			}
			i++;
		}
		return current;
	}
	
	public void delete(int pos) {
		
	}
	
	/** Gets the height of the tree
	 * @return Returns 
	 */
	public int getHeight() {
		return 0;
	}
	
	public BinaryTree getSubtree(int pos) {
		return null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	/** Checks whether the tree is isomorphic with an other tree.
	 * Two trees are isomorphic if they have the same visual appearance.
	 * @param other The other tree that is being compared.
	 * @return Returns true if the trees are isomorphic or false otherwise.
	 */
	public boolean isIsomorphic(BinaryTree<T> other) {
		return true;
	}
	
	/** Gets the number of isomorphic trees for a given number of nodes.
	 * @param nodeNum The number of nodes.
	 * @return Returns the number of isomorphic trees.
	 */
	public static int numIsomorphicTrees(int nodeNum) {
		if (nodeNum < 0) return -1;
		int results[] = new int[nodeNum + 1];
		results[0] = 0;
		results[1] = 1;
		results[2] = 2;
		results[3] = 5;
		for (int i = 4; i <= nodeNum; i++) {
			for (int j = 0; j < i; j++)
			{
				results[i] += results[j] * results[i - j - 1];
			}
		}
		return results[nodeNum];
	}
	
	public void traverse(SearchMethod method, Callback callback) {
		switch (method) {
		case INORDER:
			
			break;
		case BREADTH_FIRST:
			Queue queue;
			break;
			default:
				break;
		}
	}
	
	public String toString(SearchMethod method) {
		switch (method) {
		case INORDER:
			
			break;
		case BREADTH_FIRST:
			
			break;
			default:
				break;
		}
		return "";
	}
}
