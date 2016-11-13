package ads;

/** A tree data structure where each node have at maximum two children nodes.
 *
 */
public class BinaryTree<T> {
	
	protected BinaryNode<T> root = null;
	private int size = 0;
	public enum SearchMethod {BREADTH_FIRST, POST_ORDER, INORDER, PRE_ORDER};
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	
	/** Construct Binary Tree from a root node.
	 * 
	 */
	public BinaryTree(BinaryNode<T> root) {
		this.root = root;
		/* TODO: Figure out what to do with size member.
		 * Maybe make size method O(n).
		 */
	}
	
	/** Adds a new element at the first empty position.
	 * @param object The object to add to the tree.
	 */
	public void add(T object) {
		BinaryNode<T> node = new BinaryNode<T>(object);
		if (root == null) {
			root = node;
		} else {
			LinkedQueue<BinaryNode<T>> queue = new LinkedQueue<BinaryNode<T>>();
			queue.push(root);
			while (!queue.isEmpty()) {
				BinaryNode<T> current = queue.pop();
				
				if (current.getLeft() != null) {
					queue.push(current.getLeft());
				} else {
					current.setLeft(node);
					break;
				}
				if (current.getRight() != null) {
					queue.push(current.getRight());
				} else {
					current.setRight(node);
					break;
				}
			}
		}
	}
	
	/** Adds a new object at the given position.
	 * TODO Can not insert if node already exist.
	 * @param pos The position.
	 * @param object The object to add to the tree.
	 */
	public void insert(int pos, T object) {
		BinaryNode<T> node = new BinaryNode<T>(object);
		if (root == null) {
			root = node;
		} else {
			BinaryNode<T> temp = root;
			String binary = Integer.toBinaryString(pos);
			for (int i = 0; i < binary.length(); i++) {
				if (binary.charAt(i) == '0') {
					if (temp.getLeft() == null) {
						temp = temp.getLeft();
					}
				} else {
					
				}
			}
		}
	}
	
	/** Gets the value at a given position.
	 * 
	 * @param pos The position.
	 * @return Returns the value of the node.
	 */
	public T getAt(int pos) {
		return getNode(pos).getValue();
	}
	
	/** Gets the BinaryNode at a given position.
	 * 
	 * @param pos The position.
	 * @return Returns the BinaryNode.
	 */
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
	
	/** Gets the height of the tree.
	 * @return Returns 
	 */
	public int getHeight() {
		return 0;
	}
	
	/** Gets a subtree starting at the specified node.
	 * 
	 * @param pos The position to start the subtree.
	 * @return Returns a new BinaryTree as a subtree.
	 */
	public BinaryTree<T> getSubtree(int pos) {
		return new BinaryTree<T>(getNode(pos));
	}
	
	/** Checks whether the binary tree is empty.
	 * 
	 * @return Returns true if the tree is empty and false otherwise.
	 */
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
			for (int j = 0; j < i; j++) {
				results[i] += results[j] * results[i - j - 1];
			}
		}
		return results[nodeNum];
	}
	
	public void traverse(SearchMethod method, Callback callback) {
		if (isEmpty()) return;
		switch (method) {
		case INORDER:
			
			break;
		case BREADTH_FIRST:
			LinkedQueue<BinaryNode<T>> queue = new LinkedQueue<BinaryNode<T>>();
			queue.push(root);
			while (!queue.isEmpty()) {
				BinaryNode<T> current = queue.pop();
				callback.execute(current.getValue());
				
				if (current.getLeft() != null) {
					queue.push(current.getLeft());
				}
				if (current.getRight() != null) {
					queue.push(current.getRight());
				}
			}
			break;
			default:
				break;
		}
	}
	
	public String toString(SearchMethod method) {
		final String result = "";
		/*traverse(method, new Callback() {
			String str = "";
			@Override
			public void execute(Object o) {
				result += o;
			}
		});*/
		return result;
	}
}
