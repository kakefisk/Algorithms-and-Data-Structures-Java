package ads;

/** A circular buffer
 * 
 */
public class CircularBuffer<T> {

	private T[] buffer;
	private int size = 0;
	private int capacity;
	private int writeCursor = 0;
	private int readCursor = 0;
	
	/** Constructs a circular buffer.
	 * @param capacity The capacity to assign the buffer.
	 */
	public CircularBuffer(int capacity) {
		this.capacity = capacity;
		buffer = (T[]) new Object[capacity];
	}
	
	/** Gets the capacity of the buffer.
	 * @return Returns the capacity of the buffer.
	 */
	public int getCapacity() {
		return capacity;
	}
	
	/** Gets the number of elements in the buffer that has not been read.
	 * @return Returns the current size of the buffer.
	 */
	public int getSize() {
		return size;
	}
	
	/** Checks whether the buffer is full.
	 * @return Returns true if the buffer is full and false otherwise.
	 */
	public boolean isFull() {
		return size == capacity;
	}
	
	/** Clears the buffer.
	 * 
	 */
	public void clear() {
		size = 0;
		writeCursor = 0;
		readCursor = 0;
	}
	
	/** Writes an element to the buffer.
	 * @param object The object to add.
	 * @return Returns true if the object was inserted or false if the buffer is full.
	 */
	public boolean write(T object) {
		if (size == capacity) return false;
		if (writeCursor == capacity) {
			writeCursor = 0;
			buffer[writeCursor++] = object;
			size++;
		} else {
			buffer[writeCursor++] = object;
			size++;
		}
		return true;
	}
	
	/** Reads the next element in the buffer
	 * @return Returns the next unread element in the buffer. Returns null if there is nothing to read.
	 */
	public T read() {
		if (readCursor == writeCursor) return null;
		size--;
		if (readCursor == capacity) {
			readCursor = 0;
			return buffer[readCursor++];
		} else {
			return buffer[readCursor++];
		}
	}

}
