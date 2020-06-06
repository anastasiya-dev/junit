package by.academy.junit.Homework7.Task3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(value = Parameterized.class)
public class TestDivide extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public TestDivide(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:multiplication({0}*{1})= {2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 1, 1 }, { 12, 3, 4 }, { 0, 2, 0 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getDivide(valueA, valueB));
	}
}
