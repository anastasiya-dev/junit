package by.academy.junit.Homework7.Task3;

import org.junit.runner.JUnitCore;

public class TestProgram {
	
	public static void main(String[] args) {
		JUnitCore runner = new JUnitCore();
		runner.addListener(new CalculatorTestListener());
		runner.run(TestSuite.class);
	}	
}
