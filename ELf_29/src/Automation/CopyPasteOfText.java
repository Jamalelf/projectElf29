package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteOfText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("trainee"+Keys.CONTROL+"ac");
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
