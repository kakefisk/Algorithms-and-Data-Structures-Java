package ads;

public class Node<T> {

	private T value;
	private Node<T> next;
	
	
	/** The Node object constructor.
	 * @param value The value of the new node.
	 */
	public Node(T value) {
		this.value = value;
	}

	/** Gets the value of the node.
	 * @return Returns value.
	 */
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
