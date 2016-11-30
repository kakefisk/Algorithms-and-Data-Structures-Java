package ads;

public class LinkedTabularList<T> implements List<T> {
	
	private int capacity = 8;
	private int next[];
	private T value[];
	private int start = -1;
	private int free = 0;
	private int size = 0;
	
	public LinkedTabularList() {
		next = new int[capacity];
		value = (T[]) new Object[capacity];
	}

	public void add(T t) {
		if (start == -1) {
			start = free;
		}
		int current = free;
		free = next[free];
		value[free] = t;
		next[current] = free;
		next[free] = -1;
		free++;
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
		// TODO Auto-generated method stub
		return null;
	}
	
	private int internalIndex(int pos) {
		// TODO: Write this in a better way
		int n = start;
		for (int i = 0; i < capacity && n != -1; i++) {
			n = next[n];
			if (i == pos) break;
		}
		return -1;
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
