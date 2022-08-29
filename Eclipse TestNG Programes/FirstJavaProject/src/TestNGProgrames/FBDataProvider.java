package TestNGProgrames;

import org.testng.annotations.DataProvider;

public class FBDataProvider {
	  @DataProvider
	  public Object[][] FBdpprovider() {
	    return new Object[][] {
	      new Object[] { "gautamkharde1995@gmail.com", "123456789" },
	      new Object[] { "gautam", "12345" },
	    };
	  }

}
