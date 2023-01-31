import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {

	static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		String veggies[] = { "Brocolli", "Cucumber", "Beetroot" };
		int j = 0;

		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		//Here We pass actual Arguments
		addItems(driver,veggies);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		String name=driver.findElement(By.className("promoInfo")).getText();
		System.out.println(name);
		
		
		

	}

	public static void addItems(WebDriver driver,String veggies[] ) {
		int j=0;
		List<WebElement> products = driver
				.findElements(By.cssSelector("div[class='product'] h4[class='product-name']"));

//		for(int i =0;i<products.size();i++) {
//			    String name=products.get(i).getText();
//			    if(name.contains("Cucumber")) {
//			    	//Here We were Specifying which Button needs to Clicked;
//			    	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//			    }
//		}


		for (int i = 0; i < products.size(); i++) {
			String name[] = products.get(i).getText().split("-");
			String formattedString = name[0].trim();
			List itemNeeded = Arrays.asList(veggies);
			if (itemNeeded.contains(formattedString)) {
				j++;
				 //Here We were Specifying which Button needs to Clicked;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == veggies.length)
					break;
			}
		}
	}

}
