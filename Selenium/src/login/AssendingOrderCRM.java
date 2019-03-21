package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssendingOrderCRM {
	
	 static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		String browser= "chrome";
		
		System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
					
	    driver = new ChromeDriver();
	 
	    driver.manage().window().maximize();
	 
	    driver.get("http://classic.freecrm.com/index.html");
		
	    driver.findElement(By.name("username")).sendKeys("bprudvireddy");
	    driver.findElement(By.name("password")).sendKeys("chanti@123");
	    
	    WebElement  login= driver.findElement(By.xpath("//input[@value='Login']"));
	 
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		 
		 
		 Thread.sleep(3000);
		 
		jse.executeScript("arguments[0].click();", login);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),'Setup')]")).click();
		
		driver.findElement(By.linkText("Setup Field Sets")).click();
		
		driver.findElement(By.linkText("Product Groups")).click();
		
		List<WebElement> element = driver.findElements(By.xpath("//input[@type='text' and contains(@name,'key')]"));
		
		for(int i=0;i<=element.size()-2;i++) {
			
		WebElement e1=element.get(i);
		WebElement e2=element.get(i+1);
		
		String s1 = e1.getAttribute("value");
		String s2 = e2.getAttribute("value");
	    
		System.out.println(s1.compareTo(s2));
		
			
	    /* List<WebElement> element1 = driver.findElements(By.
			        xpath("//input[@type='text' and contains(@name,'key')]"));
			  
	      for(WebElement elease:element1) {
			  
		   System.out.println(elease.getAttribute("value"));
			 
		 }	*/ 
	      
	  }
			    
   }

}
