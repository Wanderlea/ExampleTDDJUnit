package com.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty(){
		new ArrayList<Object>().get(0);
	}
	
	/*@Test(expected = IndexOutOfBoundsException.class)
	public void emptyList(){
		List<String> list = new ArrayList<String>();
		list.add("teste");
		list.get(0);
	}*/

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void shoudTestExceptionMessage() throws IndexOutOfBoundsException{
		List<Object> List = new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index: 0, Size: 0");
		List.get(0);
	}
	
	@Test
	public void testExceptionMessage(){
		try {
			new ArrayList<Object>().get(0);
			fail("Waiting for exception to be thrown");
		} catch (IndexOutOfBoundsException ex) {
			assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
		}
	}
}
