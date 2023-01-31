import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MiscellenousImp {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//To Delete Specific Cookie
		//driver.manage().deleteCookieNamed("espf");
		driver.get("https://google.com/");
		
		//How to Take ScreenShot in Selenium
		//First we are casting our driver to TakesScreenshot Object and in getScreenshotAs we are telling
		//Taking screen shot in file format;
		
		// We have our Screenshots in F1 but we need to see in Local machine right so that we use FileUtils
		// Which is from org.apache.commons.io.FileUtils;
		
		//First I need to Download this jar from https://commons.apache.org/proper/commons-io/
		//So that eclipse will have knowledge about File and Unzip that jar and paste into java build path->
		// Right on project-> Properities-> Libraries->java build Path-> click on ClassPath-> Add External Jar
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\sonin\\screenshot.png"));
		
	
	


		

	}

}
