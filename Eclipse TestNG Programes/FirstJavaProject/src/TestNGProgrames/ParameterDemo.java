package TestNGProgrames;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
  @Test
  @Parameters({"value1", "value2"})
  public void sum(int v1, int v2) {
	  int sum = v1+v2;
	  System.out.println("Addition: " + sum);
  }
  
  @Test
  @Parameters({"value1", "value2"})
  public void division(int v1, int v2) {
	  int div = v1-v2;
	  System.out.println("Division: " + div);
  }
}
