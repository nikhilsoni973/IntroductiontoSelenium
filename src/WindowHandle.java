import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		//how to switch from parent window to child window
		//as driver have scope in parent window only we have to provide knowledge about child window
		
		//Get Id of Window
		

		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//strong a
		String name=driver.findElement(By.cssSelector("strong a")).getText();
		//String name=driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(name);
		//Switching back to Parent Window Again
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(name);
		

	}

}
