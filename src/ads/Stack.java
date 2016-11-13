package ads;

public interface Stack<T> {

	public void push(T object);
	public T peek();
	public T pop();
	public int size();
	public boolean isEmpty();
	public void clear();

}