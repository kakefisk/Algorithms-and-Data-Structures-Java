package ads;

import java.util.ArrayList;

public class Dictionary<Key, Value> {
	
	final int size = 103;
	ArrayList<Pair<Key, Value>> list[] = (ArrayList<Pair<Key, Value>>[]) new Object[size];
	
	public void put(Key key, Value value) {
		int hashkey = hash(key);
		ArrayList<Pair<Key, Value>> row = list[hashkey];
		row.add(new Pair<Key, Value>(key, value));
	}
	
	public Value get(Key key) {
		int hashkey = hash(key);
		ArrayList<Pair<Key, Value>> row = list[hashkey];
		int i = row.indexOf(key);
		if (i == -1) {
			return null;
		}
		return row.get(i).b;
	}
	
	public boolean exists(Key key) {
		int hashkey = hash(key);
		ArrayList<Pair<Key, Value>> row = list[hashkey];
		int i = row.indexOf(key);
		if (i == -1) {
			return false;
		}
		return true;
	}
	
	private int hash(Key key) {
		return key.hashCode() % size;
	}
}
