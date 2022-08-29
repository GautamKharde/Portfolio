package TestNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _94_ParameterMul {
	  @Test
	  @Parameters({"val1","val2"})
	  public void Mul(int v1, int v2) {
		  int Mul = v1*v2;
		  System.out.println("Multiplication is: " + Mul);
	  }
}
