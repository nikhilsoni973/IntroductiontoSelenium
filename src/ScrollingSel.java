import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingSel {
	

	public static void main(String[] args) throws InterruptedException {
		//Find Total Number of Amounts in Table
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//How to Scroll Window 
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		//How to Scroll on Table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> datas=driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
		int sum=0;
		for(WebElement data: datas) {
			sum+=Integer.parseInt(data.getText());
		}
		System.out.println(sum);
		String totalAmount[]=driver.findElement(By.className("totalAmount")).getText().split(":");
		String amount=totalAmount[1].trim();
		int amounts=Integer.parseInt(amount);
		Assert.assertEquals(sum, amounts);
       
	}

}
