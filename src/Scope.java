import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//I want to calculate Total Number of Links count;
		
		//https://www.rahulshettyacademy.com/AutomationPractice/
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		//give us Methods so that we can automate on Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.cssSelector("a")).size());
		
		// Find the Total Number of Links which are present in footer section only
		//Here we will limit the scope of driver to footer section only
		//div[id='gf-BIG'] 
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		//Now this footerDriver can play of driver
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//Finding Total Number of Links in one section of Footer
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//Click on Each Link on Column and check whether Link is working or not and Get Title of all the tabs
		List<WebElement> productsLinks=columnDriver.findElements(By.tagName("a"));
		for(WebElement pro: productsLinks) {
			String clickOnLinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
			//Coz Sendkeys can handle keyBoard Interaction
			pro.sendKeys(clickOnLinks);
			Thread.sleep(5000);
		}
		
		
			Set<String> windows=driver.getWindowHandles();
			Iterator<String> it =windows.iterator();
			//Has Next Will say that next index is present or not
			//Next()-> It will actually move to that window;
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			
		}
		
		
		

	}

}
