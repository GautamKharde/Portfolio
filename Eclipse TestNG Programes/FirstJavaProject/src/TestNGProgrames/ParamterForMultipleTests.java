package TestNGProgrames;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterForMultipleTests {
	 @Test
	  @Parameters({"value1", "value2"})
	  public void f(int v1, int v2) {
		  int sum = v1+v2;
		  System.out.println("Addition: " + sum);
	  }
}
