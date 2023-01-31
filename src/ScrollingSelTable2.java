import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingSelTable2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		List<WebElement> datas=driver.findElements(By.cssSelector("table[name='courses'] td:nth-child(3)"));
		int sum=0;
		Thread.sleep(3000);
		for(WebElement data:datas) {
			sum+=Integer.parseInt(data.getText());
		}
		System.out.println(sum);
		
	}

}
