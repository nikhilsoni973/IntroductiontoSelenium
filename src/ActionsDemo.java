import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		//this actions class will help to move our mouse to this Element which we specify
		//With build and perform-> We are just mentioning where our element is 
		//build()-> ready to execute
		//perform-> perform this build
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("table").doubleClick().build().perform();
		//Context Click is Right Click Basically
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		

		

	}

}
