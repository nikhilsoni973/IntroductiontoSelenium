import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommercePractice {

	public static void main(String[] args) {
		
		String data[]= {"Brinjal","Tomato","Pumpkin"};
		//Practice Ecommerce Automation
		
		//Used to Invoke ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		//give us Methods so that we can automate on Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));

		List veggies=Arrays.asList(data);
        
		int j=0;
		for(int i=0;i<products.size();i++) {
			String formattedProducts[]=products.get(i).getText().split("-");
			String items=formattedProducts[0].trim();
			if(veggies.contains(items)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			if(j==data.length)break;
		}
	}

}
