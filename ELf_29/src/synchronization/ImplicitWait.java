package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("jhgvhjsdgjg");
	driver.findElement(By.name("password")).sendKeys("116vhdsfh");
	driver.findElement(By.xpath("//div[text()='Log In']")).isEnabled();

	}

}
