import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//Check Weather table is sorted or not
		//Click on table
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//Capture all the values of column into List
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		//and GetText() so that we get value of that List and prepare new List->Original List
		List<String> originalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		//Sort in the new List -> lets call it sorted List
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		//Compare Sorted List and Original List
        Assert.assertTrue(originalList.equals(sortedList));  
        
        //Return the Price of Rice'
        List<String> price;
        
        do {
        	List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
        	price=rows.stream().filter(s->s.getText().contains("Cheese"))
        	        .map(s->getVeggiePrice(s)).collect(Collectors.toList());
        	        
        	        price.forEach(a->System.out.println(a));
        	        
        	        //But Rice is not present in first page, so we will do pagination
        	        if(price.size()<1) {
        	        	driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
        	        }
        }while(price.size()<1);
		
	}
	
	//Building my own Custom method
	

	private static String getVeggiePrice(WebElement value) {
		
		String veggiePrice=value.findElement(By.xpath("following-sibling::td[1]")).getText();
		return veggiePrice;
		
	}

}
