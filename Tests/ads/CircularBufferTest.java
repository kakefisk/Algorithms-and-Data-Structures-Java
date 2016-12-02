package ads;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularBufferTest {

	@Test
	public void testCircularBuffer() {
		CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(8);
		assertTrue("Size is 0 when buffer is created", buffer.getSize() == 0);
		assertTrue("Capacity is set when buffer is created", buffer.getCapacity() == 8);
	}

	@Test
	public void testIsFull() {
		CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(3);
		buffer.write(1);
		buffer.write(2);
		assertTrue("isFull() returns false when list is not full.", buffer.isFull() == false);
		buffer.write(3);
		assertTrue("isFull() returns true when list is full.", buffer.isFull() == true);
	}

	@Test
	public void testClear() {
		CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(8);
		buffer.write(1);
		buffer.write(2);
		buffer.clear();
		assertTrue("Size is reset when clearing.", buffer.getSize() == 0);
		buffer.write(100);
		assertTrue("Cursors are reset when clearing", buffer.read() == 100);
	}

	@Test
	public void testWrite() {
		CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(3);
		buffer.write(1);
		assertTrue("Size is increased when writing", buffer.getSize() == 1);
		assertTrue("Writing to buffer works.", buffer.read() == 1);
		buffer.write(2);
		buffer.write(3);
		buffer.write(4);
		assertTrue("Writing to a full buffer returns false", buffer.write(5) == false);
	}

	@Test
	public void testRead() {
		CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(8);
		assertTrue("Reading empty buffer returns null.", buffer.read() == null);
		buffer.write(1);
		assertTrue("Reading from buffer works", buffer.read() == 1);
		assertTrue("Reading decreases size", buffer.getSize() == 0);
	}

}
