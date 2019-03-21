package work;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Framework {
	static WebDriver driver;
@Test	
public static void Frame(){
System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
		
driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.americanairlines.in/i18n/moresearch.jsp?locale=en_IN");

WebElement element = driver.findElement(By.xpath("//span[text()='Yes']/../child::span[@class = 'control']"));
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", element);
driver.findElement(By.xpath("//a[contains(@href,'oneway')]")).click();

}
}
