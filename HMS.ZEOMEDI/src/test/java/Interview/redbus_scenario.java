package Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class redbus_scenario {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("bangalore");
		driver.findElement(By.xpath("//text[text()='Bangalore']")).click();
		driver.switchTo().activeElement().sendKeys("mysore");
		driver.findElement(By.xpath("//text[text()='Mysore']")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		driver.findElement(By.xpath("//div[@class='button']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for (int i = 0; i <20; i++) {
			js.executeScript("window.scrollBy(0,500)");
		}
		int busses = driver.findElements(By.xpath("//li[@class='row-sec clearfix']")).size();
		System.out.println(busses);
		if (busses==51) {
			System.out.println("No of busses are verified");	
		}else {
			System.out.println("busses count is not verified");
		}
		driver.close();
		}
}
