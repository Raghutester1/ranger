package rangerdev;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AshAssert {
	
	@BeforeClass

	public void beforeclass(){
		System.out.println("mercury");
	}
	@BeforeMethod 
	private void beforemethod() {
    System.out.println("venus");
		
	}
	
	@Test 
	private void testcase1() {
    System.out.println("method");
	}
	
	@Test
	private void testcase2() {
		System.out.println("man");

	}
	@Test
	private void testcase3() {
		System.out.println("ram");

	}
	
	@AfterMethod
	private void aftermethod() {
    System.out.println("cricket");
	}
    
	@AfterClass
	private void afterclass() {
		System.out.println("master");

	}	
}
