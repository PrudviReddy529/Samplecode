package work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tripadvisor {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
					
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in/");
		//Thread.sleep(2000);
		
		WebElement switc = driver.findElement(By.id("Monikers"));
		driver.switchTo().frame("Monikers");
		Thread.sleep(2000);
		
		WebElement alt = driver.findElement(By.xpath("//div[text()='Get started']"));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver; 
		 jse1.executeScript("arguments[0].click();", alt);
		 
	//	driver.findElement(By.xpath("//div/a/span[text()='Flights']")).click();
       
		
		//*[@id="c_onboarding-interstitial"]/div/div[2]
		

		
		
	}

}
