package ads;

/** A doubly linked list
 * A linked list where each node points to both its next and previous node.
 */
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
	
	/** Adds a new object of type T at the end of the list.
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
	
	/** Insert an object at a given position.
	 * @param pos The position to insert the object.
	 * @param object The object to insert.
	 */
	public void insert(int pos, T object) {
		DoubleNode<T> node = new DoubleNode<T>(object);
		DoubleNode<T> prev = nodeAt(pos - 1);
		DoubleNode<T> next = prev.getNext();
		node.setNext(next);
		node.setPrev(prev);
		prev.setNext(node);
		next.setPrev(node);
		
	}
	
	private DoubleNode<T> nodeAt(int pos) {
		if (pos < 0 || pos >= size) return null;
		DoubleNode<T> current;
		
		// Start from head if position is at lower half
		if (pos <= size/2) {
			int i = 0;
			current = head.getNext();
			while (i < pos) {
				current = current.getNext();
				i++;
			}
		} else { // or from tail if not
			int i = size - 1;
			current = tail.getPrev();
			while (i > pos) {
				current = current.getPrev();
				i--;
			}
		}
		return current;
	}
	
	/** Gets the first object.
	 * @return Returns a reference to the first object.
	 */
	public T front() {
		return head.getNext().getValue();
	}
	
	/** Gets the last object.
	 * @return Returns the reference to the last object.
	 */
	public T back() {
		return tail.getPrev().getValue();
	}
	
	/** Gets the the object at the given position.
	 * @param pos The position.
	 * @return Returns a reference to the object at the given position. Null is returned if the position is outside bounds.
	 */
	public T at(int pos) {
		if (pos < 0 || pos >= size) return null;
		return nodeAt(pos).getValue();
	}
	
	/** Removes an object at a given position.
	 * @param pos The position of the object that will be deleted.
	 * @return Returns false if the position is outside bounds or true otherwise.
	 */
	public boolean remove(int pos) {
		if (pos < 0 || pos >= size) return false;
		DoubleNode<T> current = nodeAt(pos);
		DoubleNode<T> prev = current.getPrev();
		DoubleNode<T> next = current.getNext();
		prev.setNext(next);
		next.setPrev(prev);
		size--;
		return true;
	}
	
	/** Clears the list.
	 * 
	 */
	public void clear() {
		size = 0;
		head.setNext(null);
		tail.setPrev(null);
	}
	
	/** Gets the size of the list.
	 * @return Returns the number of nodes in the list.
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
