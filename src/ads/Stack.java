package ads;

public interface Stack<T> {

	public void push(T object);
	public T peek();
	public T pop();
	public int size();
	public boolean empty();
	public void clear();

}