package by.academy.junit.Homework7.Task3;

import org.junit.Assert;
import org.junit.Test;

import by.academy.junit.Calculator;	

public class TestDivideZero extends Assert {
	@Test (expected = ArithmeticException.class)
	public void paramTest() {
		new Calculator().getDivide(10, 0);
	}
}
