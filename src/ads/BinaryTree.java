package ads;

public class BinaryTree<T> {
	
	protected BinaryNode<T> root;
	private int size;
	public enum SearchMethod {BREADTH_FIRST, POST_ORDER, INORDER, PRE_ORDER};
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	
	public void insert(T t) {
		
	}
	
	public void delete(/* ? */) {
		
	}
	
	public BinaryTree getSubtree() {
		return null;
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
	
	
	
	public String toString(SearchMethod method) {
		switch (method) {
		case INORDER:
			
			break;
			default:
				break;
		}
		return "";
	}
}
