package ads;

import static org.junit.Assert.*;

import org.junit.Test;

public class DictionaryTest {
	
	Dictionary<Integer, Integer> dict = new Dictionary<Integer, Integer>();

	@Test
	public void testPut() {
		dict.put(1, 10);
	}

	@Test
	public void testGet() {
		dict.put(1, 10);
		assertTrue("", dict.get(1) == 10);
	}

	@Test
	public void testExists() {
		fail("Not yet implemented");
	}

}
