package TestNGProgrames;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class xyz_2 {
	@Test
	@Parameters({"value1", "value2"})
	public void multiplication(int v1, int v2) {
		int mul = v1*v2;
		System.out.println("Mul:" + v1 + "*" + v2 +" = " + mul);
	}

}
