import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeOptions class are used to manage behaviour of chromeDriver
		ChromeOptions options = new ChromeOptions();
		//Similarly We have FirefoxOptions() and EdgeOptions and SafariOptions
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernik\\chromedriver.exe");
		//Here we pass options as arguement because we need to tell chromeDriver how to behave !
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		//if We hit this Website we will see Your connection is not private
		System.out.println(driver.getTitle());
        

	}

}
