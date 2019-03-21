package createcompany;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class createCom {
	
	static WebDriver driver;
	static Select Options;
	static WebElement Drop;
	
	
	public static void main(String[] args) throws Exception{
		launch_Browser("chrome");
		launch_Application("http://classic.freecrm.com/index.html");
		Login("bprudvireddy","chanti@123");
		navigate_To_NewCompany_Page();
		enter_Company_Details();
		
		//Thread.sleep(4000);
	  driver.quit();
	}
	
	
	public static void launch_Browser(String browser) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   System.out.println(driver.manage().window().getSize());
	   
	}
	
	
	public static void closeBrowser() {
		driver.close();
	}
	
	
	public static void launch_Application(String url) {
		
	    driver.get(url);
	 
	    List<WebElement> elecol = driver.findElements(By.xpath("//input[@name='username']"));
	    if(elecol.size()==0) {
	    	System.out.println("Application was not launched:");
	    	System.exit(0);
	    }else {
	    	System.out.println("Application has been launched:");
	    }  
	}
	
	public static void Login(String username, String password) {
   /* WebElement change= driver.findElement(By.xpath("//a/span[text()='Log In']"));
    JavascriptExecutor jse = (JavascriptExecutor) driver; 
	 jse.executeScript("arguments[0].click();", change);*/
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	 WebElement  loginbutton = driver.findElement(By.xpath("//input[@class='btn btn-small']"));
	 JavascriptExecutor jse1 = (JavascriptExecutor) driver; 
	 jse1.executeScript("arguments[0].click();", loginbutton);
	 
	 List<WebElement> elecol = driver.findElements(By.name("mainpanel"));
	 driver.switchTo().frame("mainpanel");
	 
	 if(elecol.size()==0) {
		 System.out.println("user login is not successfull:");
		 System.exit(0); 
	 }else {
		 System.out.println("user login is successfull:");
   }
 
 }	
	
	public static void navigate_To_NewCompany_Page() {
	
		WebElement companyMenuLink = driver.findElement(By.xpath("//a[contains(text(),'Companies')]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(companyMenuLink).build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'New Company')]")).click();
       
		List<WebElement> elecol = driver.findElements(By.xpath("//legend[contains(text(),'Create New  Company')]"));
		
		if(elecol.size()==0) {
			System.out.println(" create a new company is not successfull opened:");
			System.exit(0);
		}else {
			System.out.println("create a new company is successfull opened:");
		}
		
	}
	
	public static void enter_Company_Details() {
		
	String Company="techmahendra";
	String Industry= "information technology";
	Double Revenue=100000.25;
	int Employees=200;
	//String Status="active";
	
	driver.findElement(By.id("company_name")).sendKeys(Company);
	driver.findElement(By.name("industry")).sendKeys(Industry);
	driver.findElement(By.id("annual_revenue")).sendKeys(String.valueOf(Revenue));
	driver.findElement(By.id("num_of_employees")).sendKeys(String.valueOf(Employees));
	

	Drop = driver.findElement(By.name("status"));
	Options = new Select(Drop);
	Options.selectByVisibleText("Active");
	
    Drop = driver.findElement(By.name("category"));
	Options = new Select(Drop);
	Options.selectByVisibleText("Partner");
	
	Drop = driver.findElement(By.name("priority"));
	Options = new Select(Drop);
	Options.selectByVisibleText("Medium");
	
	Drop = driver.findElement(By.name("source"));
    Options = new Select(Drop);
	Options.selectByVisibleText("Email");
	
	driver.findElement(By.name("identifier")).sendKeys("prudvi");
	driver.findElement(By.id("vat_number")).sendKeys("1234567890");
	driver.findElement(By.id("phone")).sendKeys("12456");
	driver.findElement(By.id("fax")).sendKeys("789456123");
	driver.findElement(By.id("website")).sendKeys("www.gamil.com");
	driver.findElement(By.id("email")).sendKeys("bprudvireddy@gamil.com");
	driver.findElement(By.className("button")).click();
	
	List<WebElement> Created = driver.findElements(By.xpath("//input[@class='button'][2]"));
 	
	if(Created.size()==0){
		System.out.println("Company is not created successfully:");	
	}else{
		System.out.println("Company is created successfully:");
	}
	
	}
	
}
