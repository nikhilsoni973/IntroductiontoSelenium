
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.*;

public class UIController {

	public static void main(String[] args) throws InterruptedException {
//		---------------------------------------------------------------------------------------------------
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// WebElement staticdropdown=
		// driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		// We have Select Class in WebDriver API
//		Select dropdown = new Select(staticdropdown);
//		dropdown.selectByIndex(3);
//		getfirstSelectedOption: Will give us web Element and getText will give Text of that element
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		Select the Dropdown by Visible Text or actual text
//		dropdown.selectByVisibleText("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		Select dropdown by value attribute
//		dropdown.selectByValue("INR");
//		System.out.println(dropdown.getFirstSelectedOption().getText());

//		---------------------------------------------------------------------------------------------------

		// DropDown Looping UI
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()+" Before Clicked");
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(1000);
//		int i=1;
//		while(i<5) {
//			It will click on "+" button 4 times and total result will be 5 bcoz one adult will be already there byDefault
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()+ "After Clicked");

//		---------------------------------------------------------------------------------------------------

		// Handling Dynamic Dropdown with WebDriver API

//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//		//ctl00_mainContent_ddl_destinationStation1_CTXT
//		Thread.sleep(2000);
//		When we give value in from than to dropdown automatically gets open so there is no need to click
//		on that DropDown
//		Here We are Wrapping the XPath because there are two dynamic Dropdown which is from and To
//		when we write xpath like value='MAA' it will search in from dropdown so we have to Specify search from second
//		Dropdown by wrapping the whole Xpath and Giving the Index
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

//		---------------------------------------------------------------------------------------------------

		// Handling AutoSuggestive DropDown

//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//		Thread.sleep(3000);
//		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//		for(WebElement option:options) {
//		if(option.getText().equalsIgnoreCase("india"))
//		{
//			option.click();
//			break;
// 		}
//		}

//		---------------------------------------------------------------------------------------------------

//		
		// Handling CheckBoxes
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();  
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();	
//		Check Weather Checkbox is Selected or Not
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		Here We Use FindElements because We need to get result of all matching Elements but if we use findElement
//      	than it will only give one element which matches the condition first[ Selenium Scan from Top Left]
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		Checking Wheather Element is Enable or Not by Help of attribute
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
//		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
//			System.out.println("It is Enabled");
//			Assert.assertTrue(true);
//		}
//		else {
//			Assert.assertFalse(false);
//		}
//		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();

		// Assignment
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();  
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// Handling Calender UI

//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();  
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//		Thread.sleep(2000);
//		When we give value in from than to dropdown automatically gets open so there is no need to click
//		on that DropDown
//		Here We are Wrapping the XPath because there are two dynamic Dropdown which is from and To
//		when we write xpath like value='MAA' it will search in from dropdown so we have to Specify search from second
//		Dropdown by wrapping the whole Xpath and Giving the Index
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
//		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
//		

		// Assignment

//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();  
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.findElement(By.name("name")).sendKeys("Nikhil");
//		driver.findElement(By.name("email")).sendKeys("Nikhil121@gmail.com");
//		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Nikhi1121");
//		driver.findElement(By.id("exampleCheck1")).click();
//		WebElement option=driver.findElement(By.id("exampleFormControlSelect1"));
//		Select options = new Select(option);
//		options.selectByIndex(1);
//		driver.findElement(By.id("inlineRadio1")).click();
//		driver.findElement(By.name("bday")).sendKeys("11/03/2000");
//		driver.findElement(By.cssSelector(".btn.btn-success")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

		// How to Handle Alert or Popup in Selenium
		String text = "Nikhil";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		// When we Switch our driver context to alert, It will help selenium to find if
		// there is any alert present
		// on WebPage
		System.out.println(driver.switchTo().alert().getText());
		String alertText = driver.switchTo().alert().getText();
		String alertMain[] = alertText.split(",");
		String word[] = alertMain[0].split(" ");
		System.out.println(word[1]);
		driver.switchTo().alert().accept();

		// Here we are using Confirm rather than alert so we are getting both the option
		// i.e OK and Cancel
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
