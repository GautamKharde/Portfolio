package TestNGProgrames;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameter {
  @Test
  @Parameters("message")
  public void opt(@Optional("Optional Parameter Selecetd") String message) {
	  System.out.println(message);
  }
  
  @Test
  @Parameters({"value1", "value2"})
  public void opt1(@Optional("10") int v1, @Optional("20") int v2) {
	  int sum = v1+v2;
	  System.out.println(sum);
  }
}
