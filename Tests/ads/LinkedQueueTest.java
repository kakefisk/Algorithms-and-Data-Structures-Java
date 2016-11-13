package ads;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedQueueTest {
	
	@Test
	public void testPush() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.push(10);
		assertTrue("It is possible to push to an empty queue.", queue.peek() == 10);
		queue.push(2);
		assertTrue("It is possible to push to an non-empty queue.", queue.peek() == 10);
		assertTrue("Pushing increments the size.", queue.size() == 2);
	}

	@Test
	public void testPop() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.push(10);
		queue.push(20);
		assertTrue("First call to pop removes the first value that was pushed.", queue.pop() == 10);
		assertTrue("Size is decremented after a pop.", queue.size() == 1);
		queue.push(30);
		assertTrue("Pop removes the first in the queue.", queue.pop() == 20);
	}

	@Test
	public void testPeek() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.push(10);
		assertTrue("Peek gets the correct value.", queue.peek() == 10);
		queue.push(20);
		queue.push(30);
		assertTrue("Peek gets the correct value.", queue.peek() == 10);
	}

	@Test
	public void testIsEmpty() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		assertTrue("A newly created LinkedQueue is empty.", queue.isEmpty());
		queue.push(10);
		assertFalse("After pushing, isEmpty now returns false.", queue.isEmpty());
	}

	@Test
	public void testClear() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.push(10);
		queue.push(20);
		queue.clear();
		assertTrue("The size is 0 after clearing.", queue.size() == 0);
		assertTrue("isEmpty returns true after clearing.", queue.isEmpty());
	}

}
