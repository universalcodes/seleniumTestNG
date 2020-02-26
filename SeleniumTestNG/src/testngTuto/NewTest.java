package testngTuto;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	
	@BeforeSuite
	public void beforeset() {
		
		System.out.println("Before suite check all requirements");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before class you need a suite");
	}
	
	@BeforeMethod
	public void beforemeThod() {
		
		System.out.println("before method xc need a class");
	}
	
	@BeforeTest
	public void beforeTesting() {
		
		System.out.println("before test you need clear about your requiremtns");
	}
	
  @Test(invocationCount=10)
  public void f() {
	  
	  System.out.println("The Testing code start here");
	  
	  
  }
}
