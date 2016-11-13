package ads;

public class LinkedStack<T> implements Stack<T> {

	LinkedList<T> list = new LinkedList<T>();
	
	LinkedStack() {
		
	}
	
	public void push(T object) {
		list.add(object);
	}
	
	public T peek() {
		return list.front();
	}
	
	public T pop() {
		T peek = list.front();
		list.remove(list.size() - 1);
		return peek;
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void clear() {
		list.clear();
	}

}
