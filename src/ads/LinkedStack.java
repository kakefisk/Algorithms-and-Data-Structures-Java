package ads;

public class LinkedStack<T> implements Stack<T> {

	LinkedList<T> list;
	
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
		list.remove(0);
		return peek;
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean empty() {
		return list.empty();
	}
	
	public void clear() {
		list.clear();
	}

}
