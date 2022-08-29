package TestNGPractice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _95_OptionalParameters {
	
  @Test
  @Parameters("message")
  public void opt(@Optional("Optional Parameter is selected") String message) {
	  System.out.println(message);
  }
  
  @Test
  @Parameters({"val1", "val2"})
  public void sum(@Optional("10") int val1, @Optional("20") int val2) {
	  int sum = val1+val2;
	  System.out.println("sum: " + sum);
  }
}
