package Xpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndepedentXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);

		
		
		Set<String> allwindowIds = driver.getWindowHandles();
		allwindowIds.remove(parentwindow);
		
		for(String s:allwindowIds) {
			driver.switchTo().window(s);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();	
		}
		
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_1YokD2 _3Mn1Gg']//div[@style='height: 112px; width: 112px;'])[2]/../../..//div[text()='Remove']")).click();
	
	}

}
