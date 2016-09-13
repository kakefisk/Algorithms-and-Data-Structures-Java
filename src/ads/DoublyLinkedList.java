package ads;

public class DoublyLinkedList<T> {
	
	private int size = 0;
	private DoubleNode<T> head = new DoubleNode<T>(null);
	private DoubleNode<T> tail = new DoubleNode<T>(null);

	/** DoublyLinkedList object constructor.
	 * 
	 */
	public DoublyLinkedList() {
		head.setNext(tail);
		tail.setPrev(head);
	}
	
	/** Adds a new node with the specified object at the end of the list.
	 * @param object The object that will be added to the end.
	 */
	public void add(T object) {
		DoubleNode<T> node = new DoubleNode<T>(object);
		DoubleNode<T> prev = tail.getPrev();
		node.setNext(tail);
		node.setPrev(prev);
		prev.setNext(node);
		tail.setPrev(node);
		size++;
	}
	
	/**
	 * @param pos
	 * @param object
	 */
	public void insert(int pos, T object) {
		
	}
	
	/** Gets a reference to the first object.
	 * @return 
	 */
	public T front() {
		return head.getNext().getValue();
	}
	
	/** Gets the reference to the last object.
	 * @return
	 */
	public T back() {
		return tail.getPrev().getValue();
	}
	
	/**
	 * @param pos
	 * @return
	 */
	public T at(int pos) {
		return null;
	}
	
	/**
	 * @param pos
	 */
	public void remove(int pos) {
		
	}
	
	/** Clears the list.
	 * 
	 */
	public void clear() {
		size = 0;
		head.setNext(null);
		tail.setPrev(null);
	}
	
	/** Gets the number of nodes in the list.
	 * @return Returns the size of the list.
	 */
	public int size() {
		return size;
	}
	
	/** Checks if the list is empty.
	 * @return Returns true if the list size is 0 or false otherwise.
	 */
	public boolean empty() {
		return size == 0;
	}

}
