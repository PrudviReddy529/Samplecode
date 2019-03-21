package login;
import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
	
     static ChromeDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		String browser= "chrome";
	
	System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
				
    driver = new ChromeDriver();
 
    driver.manage().window().maximize();
 
    driver.get("file:///C:/Users/USER/Desktop/LoginPage%20(1).html");
		
		  driver.findElement(By.id("useName")).sendKeys("test");
		  
		  driver.findElement(By.id("pwd")).sendKeys("test");
		  
		  driver.findElement(By.name("Login")).click();
		  
		  Alert alert = driver.switchTo().alert();
		  
		  String gettext = alert.getText();
		 
    	driver.findElement(By.linkText("salesforce")).click();
    	
    	Set<String> allhandles = driver.getWindowHandles();
    	
    	
    	for(String handle:allhandles) {
    		
    	}
    	System.out.println(driver.getTitle());
    	
    	
    	String defaultuserName =  driver.findElement(By.id("username")).getAttribute("value");
    	
    	String defaultpassword =  driver.findElement(By.id("password")).getAttribute("value");
    	
    	if(defaultuserName.isEmpty()&&defaultpassword.isEmpty()) {
    		
    		System.out.println("userName and password is empty in salesforce");
    	
    	}else {
    		System.out.println("uesrName and password is not empty");
    		
    	}
	}

}

