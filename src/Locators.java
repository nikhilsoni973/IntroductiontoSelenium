import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Help us to Invoke the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		
		//Help us to Automate the Browser
		WebDriver driver = new ChromeDriver();
		//This Globally applicable to each and Every Step
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Nikhil Soni");
		driver.findElement(By.name("inputPassword")).sendKeys("Nikhil97@");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    	Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		//Email
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john121@gmail.com");
		//Parent and Child RelationShip
		//driver.findElement(By.xpath("//form[@action='#'] //input[@type='text'][3]")).sendKeys("john121@gmail.com");
		//This is how we do in Xpath with helpful of Parent and reached to Child
		driver.findElement(By.xpath("//div/form/input[3]")).sendKeys("2837283");
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	   // driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-container']/button[1]")).click();
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Nikhil");
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.id("chkboxTwo")).click();
	    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		//Ways to Uniquely Find Element in Web Page with help of Locator
		
		//id : By.id
		//ClassName: By.className();
		//tagname
		//name
		//CSS Selector: Generator our path with helpof HTML Elements
		
//		by id : tagname#id
//		by className : tagname.class
//		by Attribute: tagname[attribute='value'];
//		Uniquely Identify krna hai toh
//		tagname[attribute='value']:nth-child(index)
//		Withhelp of Parent reaching to Child
//		form input:nth-child(3);
		
		
		//LinkText
		//By.linkText("forgot your Password")
		
		//Xpath
		//tagname[@attribute='value'];
		//tagName[@attribute='value'][index];
		//With helpof Parents
		//div/form/input[3];
		
		
		
		


	}

}
