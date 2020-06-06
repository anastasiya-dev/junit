package by.academy.junit.Homework7.Task3;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

	private int FailureCountOld;
	private static int FailureCountNew;

	@Override
	public void testRunStarted(Description description) throws java.lang.Exception {
		System.out.println("Successfully finished:");
	}

	@Override
	public void testRunFinished(Result result) throws java.lang.Exception {
		if (result.getFailureCount() == result.getRunCount()) {
			System.out.println("none");
		}
	}

	@Override
	public void testFinished(Description description) throws java.lang.Exception {
		if (FailureCountOld == FailureCountNew) {
			System.out.println(description.getMethodName());
		}
		FailureCountOld = FailureCountNew;
	}

	@Override
	public void testFailure(Failure failure) throws java.lang.Exception {
		FailureCountNew++;
	}
}
