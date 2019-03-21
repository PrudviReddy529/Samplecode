package work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	 static  WebDriver driver;
     
	
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
						
		    driver = new ChromeDriver();
			driver.get("https://www.amazon.in/mobile-phones/b/ref=nav_shopall_sbc_mobcomp_all_mobiles?ie=UTF8&node=1389401031");

			driver.manage().window().maximize();
			
			//driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
			 
		    Actions actions = new Actions(driver);

		    Actions pageDown = actions.sendKeys(Keys.PAGE_DOWN);
		
		    pageDown.perform();
		    driver.findElement(By.xpath("//li/a[text()='Redmi 6A']")).click();
		    
			List<WebElement> allPages = driver.findElements(By.xpath("//span[contains(text(),'Redmi ')]"));

			for (int pageNum = 0; pageNum < allPages.size(); pageNum++){
			System.out.println("Page Nummber : " + (pageNum+1));	
			driver.findElement(By.xpath("//a[contains(@class,'_2Xp0TH') and text()='"+allPages.get(pageNum).getText()+"']")).click();

			try {
			Thread.sleep(5000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

			List<WebElement> productList = driver.findElements(By.xpath("//div[@class='_1-2Iqu row']"));

			for (int i = 1; i <= productList.size(); i++){
			String productName = driver.findElement(By.xpath("(//div[@class='_3wU53n'])["+i+"]")).getText();

			//String price = driver.findElement(By.xpath("//div[text()='"+productName+"']/parent::div/following-sibling::div/descendant::div[@class='_1vC4OE _2rQ-NK']")).getText();
			String price = driver.findElement(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])["+i+"]")).getText();
			System.out.println(" " + productName + " --------- " + price);
			}	
			}



			}
	}


