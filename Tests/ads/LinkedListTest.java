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
		fail("Not yet implemented");
	}

	@Test
	public void testFront() {
		fail("Not yet implemented");
	}

	@Test
	public void testBack() {
		fail("Not yet implemented");
	}

	@Test
	public void testAt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testEmpty() {
		fail("Not yet implemented");
	}

}
