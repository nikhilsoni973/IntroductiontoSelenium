import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class LatestFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//relative Locators or Friendly Locators
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement editBox=driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(editBox)).getText());
		
		WebElement dateOfBirth=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		
	    WebElement checkBoxText= driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
	    driver.findElement(with(By.tagName("input")).toLeftOf(checkBoxText)).click();
	    
	    WebElement radioButton=driver.findElement(By.id("inlineRadio1"));
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
	}

}
