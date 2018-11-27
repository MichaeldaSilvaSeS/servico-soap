package br.com.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void add() {
		Calculator calculator = new Calculator();
		int result = calculator.getCalculatorSoap().add(1, 1);
		assertEquals(2, result);
	}

}
