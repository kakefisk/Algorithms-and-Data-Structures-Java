import ads.BinaryTree;
import ads.LinkedList;

public class Program {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(6);
		System.out.println(list.front());
		System.out.println(BinaryTree.numIsomorphicTrees(6));
	}

}
