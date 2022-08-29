package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _9991_Listener {
	
	@Test
//	@Test(retryAnalyzer = _999_RetryAnalyzer.class)
	public void method1() {
		System.out.println("passed method");
		int i=10;
		Assert.assertEquals(i, 10);
	}
	
	@Test
//	@Test(retryAnalyzer = _999_RetryAnalyzer.class)
	public void method2() {
		System.out.println("failed method method2........");
		int i=10;
		Assert.assertEquals(i, 11);
	}
	
	@Test
	public void failedMethod() {
		System.out.println("failed method failedMethod........");
		Assert.assertTrue(false);
	}
}
