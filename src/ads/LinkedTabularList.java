package ads;

public class LinkedTabularList<T> implements List<T> {
	
	private int capacity = 8;
	private int next[];
	private T value[];
	private int start = 0;
	private int free = 0;
	private int size = 0;
	
	public LinkedTabularList() {
		next = new int[capacity];
		value = (T[]) new Object[capacity];
		for (int i = 0; i < capacity - 1; i++) {
			next[i] = i + 1;
		}
		next[capacity - 1] = -1;
	}

	public void add(T t) {
		if (free == -1) return;
		int current = free;
		free = next[free];
		next[current] = free;
		value[current] = t;
		size++;
	}

	public boolean insert(int pos, T t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(int pos) {
		// TODO Auto-generated method stub
		return false;
	}

	public T at(int pos) {
		if (pos < 0 || pos >= size) return null;
		return value[internalIndex(pos)];
	}
	
	private int internalIndex(int pos) {
		// TODO: Write this in a better way
		int n = start;
		for (int i = 0; i < pos; i++) {
			n = next[n];
		}
		return n;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void clear() {
		start = -1;
		free = 0;
		size = 0;
	}

}
