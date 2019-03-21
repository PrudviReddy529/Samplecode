package login;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
				
    Scanner in =new Scanner(System.in);
				
	System.out.println("enter the browser name:");
				
	String Browser = in.next();
		      
      switch(Browser.toLowerCase()) {
				
      case "chrome":
			
	System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
				
    driver = new ChromeDriver();
 
    driver.manage().window().maximize();
 
    driver.get("file:///C:/Users/USER/Desktop/LoginPage%20(1).html");
 
 	driver.findElement(By.id("useName")).sendKeys("test");
 	
    driver.findElement(By.id("pwd")).sendKeys("test");
    
    Thread.sleep(3000);
    
    driver.findElement(By.name("Login")).click();
    
    Thread.sleep(3000);
    
    driver.findElement(By.linkText("Reset Password")).click();
    
    driver.switchTo().frame("resetPassword");
    
    driver.findElement(By.id("newpwd")).sendKeys("test1");
    driver.findElement(By.id("re_password")).sendKeys("test1");
 
    
	}

	}
}

