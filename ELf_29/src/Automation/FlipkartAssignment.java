package Automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);

		driver.get("https://www.flipkart.com/");
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");

	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='realme C25Y (Metal Grey, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='realme C25Y (Glacier Blue, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='realme 8i (Space Purple, 128 GB)']")).click();
		
		Set<String> allwindowIds = driver.getWindowHandles();
		allwindowIds.remove(parentwindow);
		
		for(String s:allwindowIds) {
		driver.switchTo().window(s);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();	
		}
		
		driver.switchTo().window(parentwindow);
	//	Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Cart']")));
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='realme 8i (Space Purple, 128 GB)']/../../../..//div[text()='Remove']")));
	driver.findElement(By.xpath("//a[text()='realme 8i (Space Purple, 128 GB)']/../../../..//div[text()='Remove']")).click();
	driver.findElement(By.xpath("//div[text()='Remove Item']/..//div[text()='Remove']")).click();
	}

}
