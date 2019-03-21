package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddTocart {
       static WebDriver driver;
	public static void main(String[] args) {
	
		String mainpath = System.getProperty("user.dir");
		System.out.println(mainpath);
		System.setProperty("webdriver.chrome.driver", mainpath+"\\drivers\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/search?sid=ckf%2Fczl&otracker=clp_metro_expandable_2_4.metroExpandable.METRO_EXPANDABLE_television-store_EUG3GHFVD9&fm=neo%2Fmerchandising&iid=M_3277a3de-5590-4505-8703-4f37de8716dc_4.EUG3GHFVD9&ppt=Homepage&ppn=Homepage%22&sort=price_asc");
	    driver.findElement(By.xpath("(//div[@class='_1UoZlX'])[1]")).click();	
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    ArrayList<String> allhandles1 = new ArrayList<String>(driver.getWindowHandles());   
	    driver.switchTo().window(allhandles1.get(1)); 
	    Actions actions = new Actions(driver);
	    Actions pageDown = actions.sendKeys(Keys.PAGE_DOWN);
	    pageDown.perform();
		 driver.findElement(By.xpath("//li/button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 
	  String Cart =   driver.findElement(By.xpath("//div[@class='_3vIvU_']/div/a")).getText();
		   if(Cart.isEmpty()){
			   System.out.println(" cart is empty");
		   }else{
			   System.out.println("added to cart successfully");
			   
		   }
		driver.quit(); 
	}
	   
	
}
