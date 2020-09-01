package com.test;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import static org.junit.Assert.*;

public class RuleTest {
	
	//Created before the test run
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();
	
	@Test
	public void shoudCreateNewFileTemporaryFolder() throws IOException {
		File created = tmpFolder.newFile("file.txt");
		
		assertTrue(created.isFile());
		assertEquals(tmpFolder.getRoot(), created.getParentFile());
	}

}
