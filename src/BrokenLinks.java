import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	    
	    //We need to Call openconnection which is method of URL class so we are creating object by new URL()
	    // return type of openConnection is HttpURLConnection
	   HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
	   //Head request method
	   conn.setRequestMethod("HEAD");
	   conn.connect();
	   int responseCode=conn.getResponseCode();
	   System.out.println(responseCode);
	   
	    

	
	


		

	}

}
