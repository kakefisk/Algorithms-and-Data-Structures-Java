package ads;

public class LinkedList<T> {
	
	protected static class Node<T> {

		private T value;
		private Node<T> next;
		
		public Node(T value) {
			this.value = value;
		}
		
		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}
	
	private int size = 0;
	private Node<T> head = new Node<T>(null);

	/** LinkedList object constructor.
	 *  
	 */
	public LinkedList() {
	}
	
	/** Adds a new Node with the specified object to the back of the list.
	 * @param object The object that will be added to the end.
	 * @return Returns a reference to the node that was added.
	 */
	public Node<T> add(T object) {
		Node<T> node = new Node<T>(object);
		backNode().setNext(node);
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
		Node<T> current = nodeAt(pos);
		if (pos != size) {
			Node<T> prev = current;
			prev.setNext(node);
			node.setNext(current);
		} else {
			current.setNext(node);
		}
		return node;
	}
	
	private Node<T> nodeAt(int pos) {
		if (pos < 0 || pos >= size) return null;
		Node<T> current = frontNode();
		int i = 0;
		while (current.getNext() != null && i < pos) {
			current = current.getNext();
			i++;
		}
		return current;
	}
	
	/** Gets a reference to the first node in the list.
	 * @return Returns a reference to the head node.
	 */
	public T front() {
		return frontNode().getValue();
	}
	
	/** Gets a reference to the last node in the list.
	 * @return Returns a reference to the last node.
	 */
	public T back() {
		return backNode().getValue();
	}
	
	private Node<T> frontNode() {
		return head.getNext();
	}
	
	private Node<T> backNode() {
		Node<T> current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current;
	}
	
	/** Gets a reference to the value at a position in the list.
	 * @param pos The index in the list.
	 * @return Returns a reference to the value.
	 */
	public T at(int pos) {
		return nodeAt(pos).getValue();
	}
	
	/** Removes a node from the list.
	 * @param pos The index of the element that will be removed.
	 * @return Returns false if the position is out of range or true otherwise.
	 */
	public boolean remove(int pos) {
		if (pos < 0 || pos >= size - 1) return false;
		if (pos == 0) {
			Node<T> next = frontNode().getNext();
			head.setNext(next);
		} else {
			Node<T> prev = nodeAt(pos - 1);
			Node<T> next = prev.getNext().getNext();
			prev.setNext(next);
		}
		size--;
		return true;
	}
	
	/** Clears the list.
	 * 
	 */
	public void clear() {
		head.setNext(null);;
		size = 0;
	}
	
	/** Checks if the list is empty.
	 * @return Returns true if the list size is 0 or false otherwise.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/** Gets the number of nodes in the list.
	 * @return Returns the size of the list.
	 */
	public int size() {
		return size;
	}

}
