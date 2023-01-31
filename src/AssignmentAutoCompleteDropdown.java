import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AssignmentAutoCompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		  Thread.sleep(2000);

		List<WebElement> results=driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		SoftAssert s = new SoftAssert();
		for(WebElement result:results) {
			if(result.getText().equalsIgnoreCase("India")) {
				result.click();
				s.assertTrue(true);
				break;
			}
		}
		s.assertAll();

	}

}
