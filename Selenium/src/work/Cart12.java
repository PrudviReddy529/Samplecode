package work;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cart12 {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
		
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/search?sid=ckf%2Fczl&otracker=clp_metro_expandable_2_4.metroExpandable.METRO_EXPANDABLE_television-store_EUG3GHFVD9&fm=neo%2Fmerchandising&iid=M_3277a3de-5590-4505-8703-4f37de8716dc_4.EUG3GHFVD9&ppt=Homepage&ppn=Homepage%22&sort=price_asc");
 try {
Thread.sleep(3000);
} 
 catch (InterruptedException e) {
e.printStackTrace();
}

driver.findElement(By.xpath("//div[@data-id='TVSF6RR2FTHBGWAE']")).click();

System.out.println(driver.getTitle());
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
e.printStackTrace();
}

Set<String> handles1=driver.getWindowHandles();

for(String handle: handles1){

driver.switchTo().window(handle);
}

Actions actions = new Actions(driver);
Actions pageDown = actions.sendKeys(Keys.PAGE_DOWN);
pageDown.perform();

Thread.sleep(4000);

driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
System.out.println(driver.getTitle());

try {
Thread.sleep(5000);
} catch (InterruptedException e) {
e.printStackTrace();
}

String addcart=driver.findElement(By.xpath("//div[@class='_1Ox9a7']/a")).getText();

if(addcart.isEmpty()){
	
	System.out.println("Product not added ");
}

else
System.out.println("Product is added to cart is successfully");

driver.quit();	
	}
}