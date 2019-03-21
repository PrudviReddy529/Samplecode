package work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Class1 {
   static WebDriver driver;
   
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	   
		driver.get("https://www.flipkart.com/search?sid=ckf%2Fczl&otracker=clp_metro_expandable_2_4.metroExpandable.METRO_EXPANDABLE_television-store_EUG3GHFVD9&fm=neo%2Fmerchandising&iid=M_3277a3de-5590-4505-8703-4f37de8716dc_4.EUG3GHFVD9&ppt=Homepage&ppn=Homepage");
		/*
		//String xpath = "//div[text()='price-Low to High']";
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();

		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='_1-2Iqu row']"));

		for (int i = 1; i <= productList.size(); i++){
			
		System.out.print(driver.findElement(By.xpath("(//div[@class='_3wU53n'])["+i+"]")).getText());
		
		System.out.print(" ------ ");
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])["+i+"]")).getText());
		
		}*/
		
		driver.manage().window().maximize();
		

		List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@class,'_2Xp0TH')]"));

		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		
		
		for (int j = 1; j <= elements.size(); j++){
			
			elements.get(j-1).click();
			
			List<WebElement> element = driver.findElements(By.xpath("//div[@class='_1-2Iq row']"));
			
			for(int i=1;i<=element.size();i++){
				

				
				String productName = driver.findElement(By.xpath("(//div[@class='_3wU53n'])["+i+"]")).getText();
				//div[@class='_3wU53n']

				String price = driver.findElement(By.xpath("//div[text()='"+productName+"']/parent::div/following-sibling::div/descendant::div[@class='_1vC4OE _2rQ-NK']")).getText();
				//driver.findElement(By.xpath(""));
				System.out.println(productName + " --------- "+price);	
	
			}

			driver.findElement(By.xpath("//a[@class='_3fVaIS']/span")).click();
			driver.navigate().refresh();
			
			
		
		
		//System.out.println(driver.findElement(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])["+i+"]")).getText());


		}
		
		
		
		
	}

}
