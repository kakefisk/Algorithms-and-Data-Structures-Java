package ads;

public class DoubleNode<T> extends Node<T> {
	
	private DoubleNode<T> prev;

	public DoubleNode(T value) {
		super(value);
	}

	public DoubleNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode<T> prev) {
		this.prev = prev;
	}

}
