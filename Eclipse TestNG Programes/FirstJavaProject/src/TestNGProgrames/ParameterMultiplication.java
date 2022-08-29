package TestNGProgrames;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterMultiplication {
  @Test
  @Parameters({"value1", "value2"})
  public void Multiplication(int v1, int v2) {
	  int mul = v1 * v2;
	  System.out.println("Multiplication: "+mul);
  }
}
