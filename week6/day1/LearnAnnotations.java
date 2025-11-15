package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations {
  @Test
  public void testcase() {
	  System.out.println("testcase passed");
  }
  
  @Test
  public void testcase1() {
	  System.out.println("testcase1 passed");
  }
  @Test
  public void testcase2() {
	  System.out.println("testcase2 passed");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuite");
  }

}
