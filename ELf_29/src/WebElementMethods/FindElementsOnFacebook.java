package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsOnFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement usernametext = driver.findElement(By.id("email"));
		usernametext.sendKeys("jamal");
		WebElement passwordtext = driver.findElement(By.id("pass"));
		passwordtext.sendKeys("12gah");
		//WebElement loginbutton =driver.findElement(By.name("login"));
		//loginbutton.click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten ")).click();
	}

}
