package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calc = new Calculator();
		int sum = calc.sum("1+1+3");
		assertEquals(5, sum);
	}

}
