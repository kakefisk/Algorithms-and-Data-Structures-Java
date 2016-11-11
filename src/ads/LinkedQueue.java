package ads;

public class LinkedQueue<T> implements Queue<T> {
	
	private LinkedList<T> list = new LinkedList<T>();
	
	public LinkedQueue() {
		
	}

	@Override
	public void push(T value) {
		list.add(value);
	}

	@Override
	public T pop() {
		T value = peek();
		list.remove(list.size() - 1);
		return value;
	}

	@Override
	public T peek() {
		return list.back();
	}

	@Override
	public boolean isEmpty() {
		return list.empty();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public void clear() {
		list.clear();
	}
}
