package login;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {
		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
					
	    Scanner in =new Scanner(System.in);
					
		System.out.println("enter the browser name:");
					
		String Browser = in.next();
			      
	switch(Browser.toLowerCase()) {
					
	case "chrome":
				
		System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
					
	    driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 System.out.println(driver.manage().window().getSize());
	  
	    driver.get("https://www.facebook.com/login/");
	 
	 	boolean display = driver.findElement(By.name("email")).isDisplayed();
	 	
	 	System.out.println(display);
	 	
	 boolean enabled= driver.findElement(By.name("email")).isEnabled();
	 	
         System.out.println(enabled);
         
	 boolean  display1 = driver.findElement(By.name("pass")).isDisplayed();
	   
	     System.out.println(display1);
	   
	 boolean enabled1 = driver.findElement(By.name("pass")).isEnabled();
	   
	     System.out.println(enabled1);
	     
	 boolean clickDisplay= driver.findElement(By.name("login")).isDisplayed();
	    
	   System.out.println(clickDisplay);
	   
	 boolean enabledclick= driver.findElement(By.name("login")).isEnabled();
	    
	   System.out.println(enabledclick);
	   
	    driver.findElement(By.name("email")).sendKeys("bprudvireddy@gmail.com");
	  	
	    driver.findElement(By.name("pass")).sendKeys("chanti@123");
	     
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("loginbutton")).click();
	    
	 // Thread.sleep(3000);
	  
	   driver.close();
	    
		}

		}
		
	}
	


