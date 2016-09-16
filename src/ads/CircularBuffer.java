package ads;

public class CircularBuffer<T> {

	private T[] buffer;
	private int size;
	private int capacity;
	
	public CircularBuffer(int capacity) {
		this.capacity = capacity;
		buffer = (T[]) new Object[capacity];
	}
	
	public boolean addFirst(int n) {
		return true;
	}

}
