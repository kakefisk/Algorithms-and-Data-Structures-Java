package ads;

public interface List<T> {
	public void add(T t);
	public boolean insert(int pos, T t);
	public boolean remove(int pos);
	public T at(int pos);
	public int size();
	public boolean isEmpty();
	public void clear();
}
