import ads.ArrayList;
import ads.BinaryTree;
import ads.CircularBuffer;
import ads.DoublyLinkedList;
import ads.LinkedList;

public class Program {

	public static void main(String[] args) {
		CircularBuffer<Integer> buf = new CircularBuffer<Integer>(3);
		buf.write(100);
		buf.read();
		for (int i = 0; i < 10; i++) {
			buf.write(i);
		}
	}

}
