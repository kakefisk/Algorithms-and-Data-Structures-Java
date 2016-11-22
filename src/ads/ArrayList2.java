package ads;

public class ArrayList2<T> {
	private T[] list;
	private int capacity = 1;
	private int size = 0;
	
	public ArrayList2() {
		list = (T[])new Object[capacity];
	}
	
	public void add(T object) {
		if (capacity <= size) {
			capacity *= 2;
			T[] newlist = (T[])new Object[capacity];
			for (int i = 0; i < size; i++) {
				newlist[i] = list[i];
			}
			list = newlist;
		}
		list[size] = object;
		size++;
	}
	
	public void insert(int pos, T object) {
		
	}
	
	public T at(int pos) {
		if (pos < 0 || pos > size) return null;
		return list[pos];
	}
}
