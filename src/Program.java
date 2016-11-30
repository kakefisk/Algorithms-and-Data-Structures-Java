import ads.ArrayList2;
import ads.BinaryTree;
import ads.BinaryTree.SearchMethod;
import ads.Callback;
import ads.CircularBuffer;
import ads.DoublyLinkedList;
import ads.Graph;
import ads.LinkedList;
import ads.LinkedTabularList;
import ads.Matrix;
import ads.NeighborMatrix;

public class Program {

	public static void main(String[] args) {
		LinkedTabularList<Integer> list = new LinkedTabularList<Integer>();
		list.add(6);
		list.add(10);
		list.add(9);
		System.out.println(list.at(1));
	}

}
