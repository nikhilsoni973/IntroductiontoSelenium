import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		while(!driver.findElement(By.className("flatpickr-current-month")).getText().equalsIgnoreCase("March 2023")) {
			driver.findElement(By.cssSelector("span.flatpickr-next-month")).click();
		}
		Thread.sleep(1000);
		List<WebElement> dates=driver.findElements(By.className("flatpickr-day"));
		for(WebElement date:dates) {
			if(date.getText().equalsIgnoreCase("23")) {
				date.click();
				break;
			}
		}
		

	}

}
