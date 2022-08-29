package TestNGPractice;

import org.testng.annotations.Test;

public class _7_DependsOnGroups {
  @Test(groups = "signIn")
  public void login() {
	  System.out.println("Login successful");
  }
  @Test(dependsOnGroups = "signIn")
  public void viewAccount() {
	  System.out.println("View Account  successful");
  }
}
