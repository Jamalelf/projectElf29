package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsOnInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("jamal");
		driver.findElement(By.name("password")).sendKeys("12sdgsjgyj");
		
		//driver.findElement(By.linkText("Forgotten your password?")).click();
		driver.findElement(By.partialLinkText(" your ")).click();
		
		

	}

}
