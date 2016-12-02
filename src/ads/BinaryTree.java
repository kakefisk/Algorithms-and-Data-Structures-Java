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
	
	/** Removes a node at a given position. Descendants will also be removed.
	 * 
	 * @param pos The node position.
	 */
	public void remove(int pos) {
		if ((pos & 1) == 1) {
			pos--;
			BinaryNode<T> n = getNode(pos);
			n.setRight(null);
		} else {
			BinaryNode<T> n = getNode(pos);
			n.setLeft(null);
		}
	}
	
	/** Gets the height of the tree.
	 * @return Returns the height of the tree.
	 */
	public int getHeight() {
		if (root == null) {
			return 0;
		}
		LinkedQueue<Pair<BinaryNode<T>, Integer>> queue = new LinkedQueue<Pair<BinaryNode<T>, Integer>>();
		int level = 0;
		queue.push(new Pair<BinaryNode<T>, Integer>(root, 0));
		while (!queue.isEmpty()) {
			Pair<BinaryNode<T>, Integer> current = queue.pop();
			
			if (current.b > level) {
				level = current.b;
			}
			
			if (current.a.getLeft() != null) {
				queue.push(new Pair<BinaryNode<T>, Integer>(current.a.getLeft(), current.b + 1));
			}
			if (current.a.getRight() != null) {
				queue.push(new Pair<BinaryNode<T>, Integer>(current.a.getRight(), current.b + 1));
			}
		}
		return level;
	}
	
	/** Gets the number of nodes in the tree level with the most nodes.
	 * 
	 * @return Returns the width of tree.
	 */
	public int getWidth() {
		if (root == null) {
			return 0;
		}
		LinkedQueue<Pair<BinaryNode<T>, Integer>> queue = new LinkedQueue<Pair<BinaryNode<T>, Integer>>();
		LinkedList<Integer> widths = new LinkedList<Integer>();
		queue.push(new Pair<BinaryNode<T>, Integer>(root, 0));
		while (!queue.isEmpty()) {
			Pair<BinaryNode<T>, Integer> current = queue.pop();
			
			Integer width = widths.at(current.b);
			if (width == null) {
				widths.add(1);
			} else {
				widths.set(current.b, width + 1);
			}
			
			if (current.a.getLeft() != null) {
				queue.push(new Pair<BinaryNode<T>, Integer>(current.a.getLeft(), current.b + 1));
			}
			if (current.a.getRight() != null) {
				queue.push(new Pair<BinaryNode<T>, Integer>(current.a.getRight(), current.b + 1));
			}
		}
		int maxWidth = 0;
		//TODO: Replace with sorting or iteration
		for (int i = 0; i < widths.size(); i++) {
			int currentWidth = widths.at(i);
			if (currentWidth > maxWidth) {
				maxWidth = currentWidth;
			}
		}
		return maxWidth;
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
	public boolean isIsomorphic(BinaryTree<?> other) {
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
	
	private static int getParent(int pos) {
		if ((pos & 1) == 1) {
			pos--;
		}
		return pos/2;
	}
	
	private void recurOrder(BinaryNode<T> node, Callback callback, SearchMethod method) {
		if (method == SearchMethod.PRE_ORDER)
		{
			callback.execute(node.getValue());
		}
		if (node.getLeft() != null) {
			recurOrder(node.getLeft(), callback, method);
		}
		if (method == SearchMethod.INORDER)
		{
			callback.execute(node.getValue());
		}
		if (node.getRight() != null) {
			recurOrder(node.getRight(), callback, method);
		}
		if (method == SearchMethod.POST_ORDER)
		{
			callback.execute(node.getValue());
		}
	}
	
	public void traverse(SearchMethod method, Callback callback) {
		if (isEmpty()) return;
		switch (method) {
		case PRE_ORDER:
		case INORDER:
		case POST_ORDER:
			recurOrder(root, callback, method);
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
	
	public int binaryOccupancy() {
		LinkedQueue<BinaryNode<T>> queue = new LinkedQueue<BinaryNode<T>>();
		if (root == null) {
			return 0;
		}
		queue.push(root);
		int result = 1;
		
		while (!queue.isEmpty()) {
			BinaryNode<T> current = queue.pop();
			
			result = result << 1;
			if (current.getLeft() != null) {
				queue.push(current.getLeft());
				result++;
			}
			
			result = result << 1;
			if (current.getRight() != null) {
				queue.push(current.getRight());
				result++;
			}
		}
		// TODO: Remove the last zeros.
		return result;
	}
	
	public String toString() {
		return toString(SearchMethod.BREADTH_FIRST);
	}
	
	public String toString(SearchMethod method) {
		StringBuilder str = new StringBuilder();
		traverse(method, new Callback() {
			@Override
			public void execute(Object o) {
				str.append(o.toString());
				str.append("\n");
			}
		});
		return str.toString();
	}
}
