package ads;

public class BinaryNode<T> {
	private T value;
	private BinaryNode<T> right;
	private BinaryNode<T> left;

	public BinaryNode(T value) {
		this.value = value;
	}

	public BinaryNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryNode<T> right) {
		this.right = right;
	}
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public BinaryNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryNode<T> left) {
		this.left = left;
	}
}
