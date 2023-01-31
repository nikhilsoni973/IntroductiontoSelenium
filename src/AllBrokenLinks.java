import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AllBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		//li[class='gf-li'] a
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	    //SoftAssert
	    SoftAssert s = new SoftAssert();
	    for(int i=0;i<links.size();i++) {
	    	String url=links.get(i).getAttribute("href");
	    	  HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
	   	   //Head request method
	   	   conn.setRequestMethod("HEAD");
	   	   conn.connect();
	   	   int responseCode=conn.getResponseCode();
	   	   System.out.println(responseCode);
	   	   //Once this condition will failed so it will Print that Msg
	   	   s.assertTrue(responseCode<400, "URl which is Broken is "+links.get(i).getText()+" Link");
	   	   
	   	   
//	   	   if(responseCode>400) {
//	   		   System.out.println(links.get(i).getText()+" URL which is Broken");
//	   		   It is hard assertion so once it identify Failure it will stop script immediately
//	   		    and wont check Further Code
//	   		   Assert.assertTrue(false);
	   	   
//	   	   }
	    }
	    //assertAll will help to know which test is failed at end of script
	    s.assertAll();

	}

}
