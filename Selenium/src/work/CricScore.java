package work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricScore {
      static WebDriver driver;
	public static void main(String[] args) {

	    String mainpath = System.getProperty("user.dir");
		System.out.println(mainpath);
		System.setProperty("webdriver.chrome.driver", mainpath+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20785/nz-vs-ind-3rd-odi-india-tour-of-new-zealand-2019");

		List<WebElement> allBatsmen = driver.findElements(By.xpath("//div[@id='innings_2']/descendant::div[@class='cb-col cb-col-100 cb-scrd-itms']/descendant::div[not(@class='cb-col-32 cb-col')][1]/a"));
		List<WebElement> allScores = driver.findElements(By.xpath("//div[@id='innings_2']/descendant::div[@class='cb-col cb-col-100 cb-scrd-itms']/descendant::div[not(@class='cb-col-32 cb-col')][3]"));

		int minScore = 0;
		String batsmanName = "";

		for (int i = 0; i< allScores.size(); i++){
		int curBatScore = Integer.parseInt(allScores.get(i).getText());	
		if (curBatScore > minScore ){
		minScore = curBatScore;
		batsmanName = allBatsmen.get(i).getText();
		}	
		}

		System.out.println(batsmanName);

		//driver.quit();
	
	}

}
