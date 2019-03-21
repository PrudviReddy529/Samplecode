package work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrangeHRM {
	static WebDriver driver;
	@Test
	public static void cldr2() throws Exception{
		
System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
	    driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
	    driver.findElement(By.xpath("//input[@name='Submit']")).click();
	    driver.findElement(By.xpath("//span[text()='Leave']")).click();
	    driver.findElement(By.xpath("//span[text()='My Leave']")).click();  
	    Thread.sleep(15000);
driver.findElement(By.xpath("//input[@id='from']/parent::div/descendant::span/child::i")).click();
        Thread.sleep(15000);
        String departDate = "15-03-2019";
		Date dt = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
		dt = sdf.parse(departDate);

		Calendar c = Calendar.getInstance();	
		c.setTime(dt);	
	
		int dayNum = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);
    	String monthName = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
       driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--month']/descendant::li/span[text()='"+monthName+"']")).click();
		}catch (ParseException e) {
			driver.findElement(By.xpath("//div[contains(@class,'select-wrapper picker')]/following-sibling::div[@title='Next month']")).click();
		//e.printStackTrace();
		}
        

	   // driver.quit();
	    
	  
	   
	}
}
//div[@class='select-wrapper picker__select--month']/descendant::li/span[text()='January']
//div[@class='picker__calendar-container']/div/descendant::div[@class='select-wrapper picker__select--month']/
//div[@class='select-wrapper picker__select--year']/following-sibling::div[@title='Previous month']




