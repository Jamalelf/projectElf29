package seleniumAssignent2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnElementOfTheSpecificWinow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.instagram.com/");
		String particularwindowtitle = "Instagram";
		
		if(particularwindowtitle.equals(driver.getTitle())) {
			driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		}else {
			System.err.println("no such element ");
		}
	}

}
