package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class _96_DataProvider {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n +", " + s);
  }

  @DataProvider 
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
      new Object[] { 4, "d" },
      new Object[] { 5, "a" },
      new Object[] { 6, "b" },
    };
  }
}
