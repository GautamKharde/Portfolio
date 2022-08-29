package TestNGPractice;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite; 
import org.testng.annotations.AfterSuite;

public class _3_AnnotationsTest {
  @Test
  public void f() {
	  System.out.println("First Test");
  }
  @Test
  public void s() {
	  System.out.println("Second Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method Test");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class Test");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class Test");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Tests Test");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Tests Test");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
