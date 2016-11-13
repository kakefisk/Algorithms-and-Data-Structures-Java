package ads;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testLinkedList() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		assertTrue(".add() increments the size by 1.", list.size() == 1);
		assertTrue("The object is added when the list is empty", list.front() == 5);
		list.add(10);
		assertTrue("The object is added when the list is non-empty", list.back() == 10);
	}

	@Test
	public void testInsert() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertTrue("Negative index fails", list.insert(-1, 0) == null);
		assertTrue("Index out of bound fails.", list.insert(1, 0) == null);
		assertTrue("List is still empty.", list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.insert(0, 1);
		assertTrue("Inserting at beginning of the list.", list.front() == 1);
		assertTrue("Size is incremented by one when inserting", list.size() == 4);
		list.insert(list.size(), 2);
		assertTrue("Inserting at the end of the list.", list.back() == 2);
		list.insert(2, 3);
		assertTrue("Inserting in the middle of the list.", list.at(2) == 3);
	}

	@Test
	public void testFront() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertTrue("Empty list returns null.", list.front() == null);
		
		list.add(10);
		list.add(20);
		list.add(30);
		assertTrue("front() returns the first value in the list", list.front() == 10);
	}

	@Test
	public void testBack() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertTrue("Empty list returns null.", list.back() == null);
		
		list.add(10);
		list.add(20);
		list.add(30);
		assertTrue("back() returns the last value in the list", list.back() == 30);
	}

	@Test
	public void testAt() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		assertTrue("Negative index fails", list.at(-1) == null);
		assertTrue("Index out of bound fails.", list.at(1) == null);
		
		assertTrue("at() gets the correct value.", list.at(1) == 20);
	}

	@Test
	public void testRemove() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertTrue("Removing from an empty list fails.", list.remove(0) == false);
		list.add(10);
		list.add(20);
		list.add(30);
		assertTrue("Negative index fails", list.remove(-1) == false);
		assertTrue("Index out of bound fails.", list.remove(list.size()) == false);
		list.remove(0);
		assertTrue("Size is decremented when removing", list.size() == 2);
		list.remove(1);
		assertTrue("The correct objects were removed.", list.front() == 20);
	}

	@Test
	public void testClear() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
	}

	@Test
	public void testEmpty() {
		fail("Not yet implemented");
	}

}
