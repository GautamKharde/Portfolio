package TestNGProgrames;

import org.testng.annotations.Test;

public class Dependency_On_Groups {
  @Test(groups="SignIn")
  public void login() {
	System.out.println("login successful.");  
  }
  
  @Test(dependsOnGroups = "SignIn")
  public void viewAccount() {
	  System.out.println("View account succesful.");
  }
}
