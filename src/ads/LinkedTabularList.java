package ads;

public class LinkedTabularList<T> implements List<T> {
	
	private int capacity = 8;
	private int next[];
	private T value[];
	private int head = 0;
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
		if (pos < 0 || pos > size) return false;
		
		size++;
		if (pos == 0) {
			int nxt = head;
			int current = free;
			free = next[free];
			int pointsToCurrent = findPointerTo(current);
			head = current;
			next[pointsToCurrent] = next[current];
			next[current] = nxt;
			value[current] = t;
			return true;
		}
		
		int prev = internalIndex(pos - 1);
		int current = free;
		free = next[free];
		int pointsToCurrent = findPointerTo(current);
		next[pointsToCurrent] = next[current];
		int nxt = next[prev];
		next[prev] = current;
		next[current] = nxt;
		value[current] = t;
		return true;
	}

	public boolean remove(int pos) {
		if (pos < 0 || pos > size) return false;
		if (pos == head) {
			head = next[head];
		}
		int prev = internalIndex(pos - 1);
		int current = next[prev];
		next[prev] = next[current];
		next[findLast()] = current;
		next[current] = -1;
		size--;
		if (free == -1) {
			free = current;
		}
		return false;
	}

	public T at(int pos) {
		if (pos < 0 || pos >= size) return null;
		return value[internalIndex(pos)];
	}
	
	private int findLast() {
		int n = head;
		for (int i = 0; i < capacity; i++) {
			n = next[n];
			if (n == -1) return i + 1;
		}
		return -1;
	}
	
	private int internalIndex(int pos) {
		int n = head;
		for (int i = 0; i < pos; i++) {
			n = next[n];
		}
		return n;
	}
	
	private int findPointerTo(int pos) {
		int n = head;
		for (int i = 0; i < size; i++) {
			int nxt = next[n];
			if (nxt == pos) break;
			n = nxt;
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
		head = 0;
		free = 0;
		size = 0;
	}
	
	public String toString() {
		String result = "";
		int n = head;
		for (int i = 0; i < size; i++) {
			result += value[i].toString();
			if (i < size - 1) {
				result += ", ";
			}
			n = next[n];
		}
		return result;
	}

	@Override
	public T front() {
		return value[head];
	}

	@Override
	public T back() {
		int n = head;
		for (int i = 0; i < size - 1; i++) {
			n = next[n];
		}
		return value[n];
	}

}
