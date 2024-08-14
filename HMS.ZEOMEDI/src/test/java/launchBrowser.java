import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class launchBrowser {

	static WebDriver driver;
	public static void main(String[] args) {
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new FirefoxDriver(options);
		
		driver.get("www.facebook.com");
	}
}
