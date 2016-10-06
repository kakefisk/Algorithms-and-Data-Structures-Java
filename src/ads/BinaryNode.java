package ads;

public class BinaryNode<T> {
	private T value;
	private BinaryNode<T> right = null;
	private BinaryNode<T> left = null;

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
