import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class EcomPrac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        String listOfProducts[]= {"Tomato","Beetroot","Cucumber"};
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		List<WebElement> products=driver.findElements(By.cssSelector(".product-name"));
		for(int i=0;i<products.size();i++) {
			String veggiesMain[]=products.get(i).getText().split("-");
			String mainVeggies=veggiesMain[0].trim();
			List vegetablesList=Arrays.asList(listOfProducts);
			if(vegetablesList.contains(mainVeggies)) {
				driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
			}
		}
		
//	    List<WebElement> products=driver.findElements(By.cssSelector(".product"));
//	     WebElement veggies= products.stream().filter(s->s.findElement(By.cssSelector(".product-name")).getText().contains("Cauliflower")).findFirst().orElse(null);
//	     System.out.println(veggies.getText());
//	     veggies.findElement(By.cssSelector("div[class='product-action'] button")).click();
	}

}
