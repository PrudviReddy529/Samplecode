package login;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTowindow {
	
	 static ChromeDriver driver;
	
		public static void main(String[] args) throws InterruptedException {
			
			String browser= "chrome";
			
		System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
					
	    driver = new ChromeDriver();
	   
	    driver.manage().window().maximize();

	    driver.get("file:///C:/Users/USER/Desktop/LoginPage%20(1).html");
	    
	   List<WebElement> elecol =  driver.findElements(By.xpath("//a[text()='Gmail'or text() ='salesforce']"));
	   
	   for(WebElement ele :elecol) {
		   ele.click();
	   }
	  
	   Set<String> allhandles = driver.getWindowHandles();
	   
	   for(String handle :allhandles) {
		   
	   driver.switchTo().window(handle);
		   
	  // if(driver.getTitle().equals("salesforce")) {
			   
	   //break;

		 //  }
		   
	   }
	 
	   System.out.println(driver.getCurrentUrl());
	}
}
