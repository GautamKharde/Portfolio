package TestNGPractice;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGPractice.xyz20000.class)
public class xyz10000 {
	
	@Test(priority = 1)
	public void login() {
		System.out.println("successfully login completed.");
	}
	
	@Test(priority = 2)
	public void checkTitile() {
		System.out.println("failed tes case..");
		Assert.assertTrue(false);
	}
	
	@Test(priority = 3)
	public void viewAccount() {
		System.out.println("skipped test case");
		throw new SkipException("skip exception thrown. ");
	}
}
