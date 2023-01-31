import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// So there is no click to go in new tab so we did it by coding
          //Switching Window without any link to new Window
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//It will open new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows=driver.getWindowHandles();
	    Iterator<String> it = windows.iterator();
	    String ParentId= it.next();
	    String ChildId= it.next();
		driver.switchTo().window(ChildId);
		//Getting this URl in newly Opened ChildTab
		driver.get("https://rahulshettyacademy.com/");
		String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		driver.switchTo().window(ParentId);
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
	    .withTimeout(Duration.ofSeconds(10))
	    .pollingEvery(Duration.ofSeconds(3))
	    .ignoring(NoSuchElementException.class);
		
		WebElement foo=w.until(new Function<WebDriver,WebElement>(){
			@Override
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.name("name")).isDisplayed()) {
					return driver.findElement(By.name("name"));
				}
				else {
					return null;
				}
			}
			});


	    
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		
		//Take Screenshot of specific WebElement: Called as Partial Screenshot also
		File src=name.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("logo.png"));
		//Just refresh our project, we will see logo.png
		
		//Get Height and width of specific webelement
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		
	}

}
