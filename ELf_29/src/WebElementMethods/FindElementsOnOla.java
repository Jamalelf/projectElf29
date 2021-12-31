package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsOnOla {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olacabs.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Ola Drive")).click();
		driver.findElement(By.partialLinkText(" Select")).click();
		
	}
}