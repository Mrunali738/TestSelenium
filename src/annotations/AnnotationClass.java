package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationClass {
  @Test
  public void f() {
	  System.out.println("I am a Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am a BeforeMethod");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am a AfterMethod");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am a BeforeClass");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("I am a AfterClass");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am a BeforeTest");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("I am a AfterTest");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am a BeforeSuite");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am a AfterSuite");
  }

}
