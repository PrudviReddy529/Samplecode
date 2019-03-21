package login;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	static WebDriver driver;
      
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		System.out.println("enter the browser name:");
		
		String Browser = in.next();
      
		
		
		switch(Browser.toLowerCase()) {
		
		case "chrome":
	
			System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
		
			 driver = new ChromeDriver();
		
			 driver.manage().window().maximize(); 
			
//			driver.get("http:\\google.com");
		break;
	
		case "ie":
			
			System.setProperty("webdriver.ie.driver", "G:\\SELENIUM\\New folder\\seleniumPoject\\Driver\\drivers\\IEDriverServer.exe");
          
			driver = new InternetExplorerDriver();
			
			 driver.manage().window().maximize(); 
				
	    break;
		 
		case "egde":
		
			System.setProperty("webdriver.edge.driver", "G:\\SELENIUM\\New folder\\seleniumPoject\\Driver\\drivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			break;
		}
		
		 driver.get("https://www.facebook.com/search/top/?q=Fb+Login");
		 
		 driver.findElement(By.id("email")).sendKeys("suresh.v@gmail.com");
		 
		 driver.findElement(By.id("pass")).sendKeys("9399935030");
		 
		 driver.findElement(By.id("loginbutton")).click();
		 
	
	}
      

	
	
  }

