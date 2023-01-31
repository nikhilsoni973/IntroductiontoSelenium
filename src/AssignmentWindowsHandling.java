import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://the-internet.herokuapp.com/windows
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("div[class='example'] a")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId= it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		String ChildWindow=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(ChildWindow);
		driver.switchTo().window(parentId);
		String parentWindow= driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(parentWindow);

	}

}
