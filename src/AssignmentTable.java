import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		//rows :div[class='left-align'] table[id='product'] tbody tr;
		//cols: div[class='left-align'] table[id='product']  tbody th
		System.out.println(driver.findElements(By.cssSelector("div[class='left-align'] table[id='product'] tbody tr")).size()+" Total Number of Rows");
		System.out.println(driver.findElements(By.cssSelector("div[class='left-align'] table[id='product']  tbody th")).size()+" Total Number of Cols");
		List<WebElement> rows=driver.findElements(By.cssSelector("div[class='left-align'] table[id='product']  tbody tr:nth-child(3)"));
		for(WebElement row: rows) {
			System.out.println(row.getText());
		}

	}

}
