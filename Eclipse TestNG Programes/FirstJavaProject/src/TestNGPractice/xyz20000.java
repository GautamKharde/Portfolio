package TestNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class xyz20000 implements ITestListener{
	

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onstart invoked ... ");
	}

	@Override
	public void onFinish(ITestContext context) {
			System.out.println("onFinish invoked...");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test method started: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test method successfully executed : " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test method failed : " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test method skipped : " + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}


}
