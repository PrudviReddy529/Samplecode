package ajay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");				
    driver = new ChromeDriver();	
	}
	//**************************
	@Test (priority=1)
	public void verifyGoogleTitle() {
	driver.get("https://www.google.com/");
	String url = driver.getTitle();
	Assert.assertEquals(url, "Google");
	}
	@Test (dependsOnMethods="verifyGoogleTitle")
	public void verifyYahooTitle() {
	driver.get("https://www.Yahoo.com/");
	String url = driver.getTitle();
	Assert.assertEquals(url, "Yahoo");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}	
}
