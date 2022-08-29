package TestNGPractice;

import org.testng.annotations.DataProvider;

public class _99_DataProviderFB {
	  @DataProvider
	  public Object[][] dpFb() {
	    return new Object[][] {
	      new Object[] { "gautam", "12345" },
	      new Object[] { "gautamhrishi", "12345" },
	    };
	  }
	  

}
