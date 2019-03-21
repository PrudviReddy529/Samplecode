package abcd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Sample1 {
 
	@BeforeTest
	public void login() {
		System.out.println("admin login successfull:");
	}
	@AfterTest
	public void logout() {
		System.out.println("admin logout successfull:");
	}
	@Test (priority=1)
	public void addVendor() {
		System.out.println("add vendor is successfull:");
	}
	@Test (priority=2)
    public void addProduct() {
    	System.out.println("add product is successfull:");  	
    }
	@Test (priority=3)
    public void addCurrency() {
    	System.out.println("add currency is successfull:");
    }
	
	
	
}
