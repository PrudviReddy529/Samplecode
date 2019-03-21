package work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon { 
		static WebDriver driver;
	public static void main(String[] args) {
	    String mainpath = System.getProperty("user.dir");
		System.out.println(mainpath);
		System.setProperty("webdriver.chrome.driver", mainpath+"\\drivers\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.amazon.in/mobile-phones/b/ref=nav_shopall_sbc_mobcomp_all_mobiles?ie=UTF8&node=1389401031");
	    
	    Actions actions = new Actions(driver);

	    Actions pageDown = actions.sendKeys(Keys.PAGE_DOWN);
	
	    pageDown.perform();
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//li/a[text()='Redmi 6A']")).click();
	
		String xpath = "//a[contains(@class,'a-link-normal')]/span";
		
	
		List<WebElement> names =driver.findElements(By.xpath(xpath));
		
		System.out.println("print the names"+names.size());
		
		for(int i=0;i<=names.size();i++){
			
			String Redmi = names.get(i).getText();
			//System.out.println("redmi phones printing:"+Redmi);
			
		List<WebElement> prices = driver.findElements(By.xpath("//span[contains(@class,'a-size-base')]"));
			System.out.println("price "+prices.size());
			
			for(int j=0;j<=prices.size();j++){     
				
				String redmiprice =prices.get(j).getText();
			
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
System.out.println("Name printing--------" +Redmi+  "printing prices--------"     +redmiprice);
				
                
			}
		}
		driver.quit();
	}
}


