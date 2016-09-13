package ads;

public class LinkedList<T> {
	
	private int size;
	private Node<T> head;

	/** LinkedList object constructor.
	 *  
	 */
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	/** Adds a new Node with the specified object to the back of the list.
	 * @param object The object that will be added to the end.
	 * @return Returns a reference to the node that was added.
	 */
	public Node<T> add(T object) {
		Node<T> node = new Node<T>(object);
		if (head == null) {
			head = node;
		} else {
			back().setNext(node);
		}
		size++;
		return node;
	}
	
	/** Inserts a node with the specified object at the specified position.
	 * @param pos The position where the new node will be inserted.
	 * @param object The object that will be inserted.
	 * @return Returns a reference to the node that was inserted.
	 */
	public Node<T> insert(int pos, T object) {
		if (pos < 0 || pos > size) return null;
		Node<T> node = new Node<T>(object);
		if (head == null) {
			head = node;
		} else {
			Node<T> current = nodeAt(pos);
			if (pos != size) {
				Node<T> prev = current;
				prev.setNext(node);
				node.setNext(current);
			} else {
				current.setNext(node);
			}
		}
		return node;
	}
	
	private Node<T> nodeAt(int pos) {
		if (pos < 0 || pos >= size || head == null) return null;
		Node<T> current = head;
		int i = 0;
		while (current.getNext() != null && i < pos) {
			current = current.getNext();
		}
		return current;
	}
	
	/** Gets a reference to the first node in the list.
	 * @return Returns a reference to the head node.
	 */
	public Node<T> front() {
		return head;
	}
	
	/** Gets a reference to the last node in the list.
	 * @return Returns a reference to the last node.
	 */
	public Node<T> back() {
		Node<T> current = head;
		if (head != null) {
			while (current.getNext() != null) {
				current = current.getNext();
			}
		}
		return current;
	}
	
	public T at(int pos) {
		return null;
	}
	
	public void remove(int pos) {
		
	}
	
	/** Clears the list.
	 * 
	 */
	public void clear() {
		head = null;
		size = 0;
	}
	
	/** Checks if the list is empty.
	 * @return Returns true if the list size is 0 or false otherwise.
	 */
	public boolean empty() {
		return size == 0;
	}

	/** Gets the number of nodes in the list.
	 * @return Returns the size of the list.
	 */
	public int size() {
		return size;
	}

}
