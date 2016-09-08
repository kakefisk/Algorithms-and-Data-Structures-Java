package ads;

public class LinkedList<T> {
	
	private int size;
	private Node<T> head;

	public LinkedList() {
		
	}
	
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
	
	public Node<T> insert(int pos, T object) {
		if (pos < 0 || pos > size) return null;
		Node<T> node = new Node<T>(object);
		if (head == null) {
			head = node;
		} else {
			Node<T> current = head;
			int i = 0;
			while (current.getNext() != null && i < pos) {
				current = current.getNext();
			}
			current.getNext();
			if (pos != size) {
				
			}
		}
	}
	
	public Node<T> front() {
		return head;
	}
	
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
		
	}
	
	public void remove(int pos) {
		
	}
	
	public void clear() {
		
	}
	
	public boolean empty() {
		return size == 0;
	}

}
