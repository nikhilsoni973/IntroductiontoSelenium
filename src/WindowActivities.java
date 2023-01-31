import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // Here selenium will wait until Elements are
																			// fully Loaded
		System.out.println(driver.getCurrentUrl() + " This is my current URL"); // give rahulshettyacademy.com as O/P
		System.out.println(driver.getPageSource() + " This is my Page Source"); // give whole page code
		System.out.println(driver.getTitle() + " This is Title"); // Give title of web page in this case it is H1:
																	// Practice Page
		
//		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");// Here Selenium will not wait 
//		driver.navigate().back(); // It will go back to google
//		driver.navigate().forward(); // It will come back to RahulShetty

	}

}
