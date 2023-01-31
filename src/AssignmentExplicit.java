import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phones[]= {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		 driver.findElement(By.id("password")).sendKeys("learning");
		 driver.findElement(By.cssSelector("input[value='user']")).click();
		 w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		 driver.findElement(By.id("okayBtn")).click();
		 WebElement options=driver.findElement(By.cssSelector("select[class='form-control']"));
		 Select s = new Select(options);
		 s.selectByIndex(0);
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.name("terms")));
		 driver.findElement(By.name("terms")).click();
		 driver.findElement(By.name("signin")).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));
		 List<WebElement> products=driver.findElements(By.cssSelector("h4.card-title"));
		 for(int i=0;i<products.size();i++) {
			int j=0;
			List mobiles= Arrays.asList(phones);
			if(mobiles.contains(products.get(i).getText())) {
				j++;
				driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
				if(j==phones.length) {
					break;
				}
			}
		 }
		 driver.findElement(By.xpath("//li[@class='nav-item active']/a")).click();
		 


	}

}
