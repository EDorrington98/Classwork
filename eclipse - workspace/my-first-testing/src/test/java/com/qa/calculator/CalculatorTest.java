package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
	Calculator calculator = new Calculator();
	calculator.divide(5.0,0.0),0);
}
	@Test
	public void multiplyTestDecimal() {
		Calculator calculator = new Calculator();
		assertEquals(0.63,calculator.multiply(0.21, 3),0);

	}
	@Test
	public void multiplyTestWithThreeSixes() {
		Calculator calculator = new Calculator();
		assertEquals(18, calculator.multiply(3, 6),0);
	}
	@Test
	public void divideTestTwentyOverTwo() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.divide(20, 2),0);
}
	@Test
	public void divideTestThirtyOverThree() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.divide(30, 3),0);
}
	@Test
	public void addTestThreePlusFive() {
		Calculator calculator = new Calculator();
		assertEquals(8, calculator.add(3, 5),0);
}
	@Test
	public void addTestThirtyPlusFive() {
		Calculator calculator = new Calculator();
		assertEquals(35, calculator.add(30, 5),0);
}
	@Test
	public void subtractTestThirtyMinusFour() {
		Calculator calculator = new Calculator();
		assertEquals(26, calculator.subtract(30, 4),0);
}
	@Test
	public void subtractTestTenMinusTwo() {
		Calculator calculator = new Calculator();
		assertEquals(8, calculator.subtract(10, 2),0);
}
	
}
