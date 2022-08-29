package TestNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class _998_ListenerClass implements ITestListener{
	

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart invoked....");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish invoked..");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Name of test method Started : " +  result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of test method Successfully executed : " +  result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Name of test method failed : " +  result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of test method skipped : " +  result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			System.out.println("onTestFailedButWithinSuccessPercentage invoked..");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout invoked...");
	}



}
