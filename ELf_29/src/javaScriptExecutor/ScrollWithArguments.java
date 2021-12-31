package javaScriptExecutor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWithArguments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		String parentid = driver.getWindowHandle();
		
		Set<String> allwindowids = driver.getWindowHandles();
		allwindowids.remove(parentid);
		
		for(String s:allwindowids) {
			driver.switchTo().window(s);
			driver.close();
		}
		driver.switchTo().window(parentid);
		
		WebElement link = driver.findElement(By.xpath("//h2[text()='Top Employers ']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",link);
}
}