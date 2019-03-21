package abcd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
	
	/*
    @BeforeMethod
    public void login() {
	System.out.println("admin login successfull:"); }
	 
	@AfterMethod
	public void logout() {
	System.out.println("admin logout successfull:"); }
	*/
	@Test (priority=4)
	public void DeleteVendor() {
		System.out.println("Delete vendor is successfull:");
	}
	@Test (priority=5)
    public void DeleteProduct() {
    	System.out.println("Delete product is successfull:");  	
    }
	@Test (priority=6)
    public void DeleteCurrency() {
    	System.out.println("Delete currency is successfull:");
    }
	
	

}
