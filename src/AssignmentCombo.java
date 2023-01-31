import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
				driver.findElement(By.id("checkBoxOption2")).click();
				String label="";
				if(driver.findElement(By.id("checkBoxOption2")).isSelected()) {
					label=driver.findElement(By.cssSelector("label[for='benz']")).getText();
				    System.out.println(label);
				}
				WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
				Select s = new Select(dropdown);
				s.selectByVisibleText(label);
				driver.findElement(By.id("name")).sendKeys(label);
				driver.findElement(By.id("alertbtn")).click();
				driver.switchTo().alert();
				String text=driver.switchTo().alert().getText();
				if(text.contains(label)) {
					driver.switchTo().alert().accept();
					System.out.println("alert was accepted");
				}
				else {
					driver.switchTo().alert().dismiss();
					System.out.println("Alert was decline");
				}
				
				
				

	}

}
