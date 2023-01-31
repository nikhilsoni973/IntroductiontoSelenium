import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name ="logged";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Nikhil Soni");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully "+name+" in.");
		System.out.println("Assertion Comparison validated");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passwordText=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] extractPassword = passwordText.split("'");
		//0th Index-Please use temporary password'
		//1th Index: rahulshettyacademy' to Login
		String mainPassword=extractPassword[1].split("'")[0];
		return mainPassword;
        //0th Index: rahulshettyacademy
        //1st index: to Login;
		
		
		
	}
	
	

}
