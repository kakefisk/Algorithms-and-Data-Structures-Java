package ads;

public interface Queue<T> {
	
	public void push(T value);
	
	public T pop();
	
	public T peek();
	
	public boolean isEmpty();
	
	public int size();
	
	public void clear();

}
