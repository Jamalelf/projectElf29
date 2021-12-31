package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement usernametext = driver.findElement(By.id("username"));
		usernametext.sendKeys("jamal");
		WebElement passwordtext = driver.findElement(By.name("pwd"));
		passwordtext.sendKeys("12as");
		

	}

}
