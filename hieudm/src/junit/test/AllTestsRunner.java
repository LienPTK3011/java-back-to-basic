package junit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AllTestsRunner {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(AllTests.class);

		String check = result.wasSuccessful() ? "right" : "wrong";

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println("All test case was pass is: " + check);

	}

}
