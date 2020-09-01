package com.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertTest {
	
	@Test
	public void testeAssertArrayEquals(){
		byte[] expected = "teste".getBytes();
		byte[] actual = "teste".getBytes();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testAssertEquals() {
		assertEquals("text", "text");
	}
	
	@Test
	public void testAssertFalse(){
		assertFalse(false);
	}
	
	@Test
	public void testAssertNotNull(){
		assertNotNull(new Object());
	}
	
	@Test
	public void testAssertNull(){
		assertNull(null);
	}
	
	@Test
	public void testAssertNotSame(){
		assertNotSame(new Object(), new Object());
	}
	
	@Test
	public void testAssertSame(){
		Integer aNumber = Integer.valueOf(765);
		assertSame(aNumber, aNumber);
	}


}
