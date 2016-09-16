package ads;

public class DoublyLinkedTabularList {

	private int next[];
	private int prev[];
	private int value[];
	private int start = -1;
	private int free = 0;
	
	public DoublyLinkedTabularList() {
		next = new int[8];
		prev = new int[8];
		value = new int[8];
	}
	
	public void addFirst(int value) {
		if (start == -1) {
			int current = free;
			free = next[free];
			next[current] = -1;
			prev[current] = -1;
			start = current;
		} else {
			int current = free;
			free = next[free];
			prev[start] = current;
			next[current] = start;
			prev[current] = -1;
			this.value[current] = value;
			start = current;
		}
	}

}
