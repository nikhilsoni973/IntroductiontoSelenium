import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		// So here we will get result and will get Stored in List veggies
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		//Rice can Brown Rice, White Rice so we check for size before filtering and after Filtering 
		List<WebElement> filteredList=veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
         Assert.assertEquals(veggies.size(), filteredList.size());
	}

}
