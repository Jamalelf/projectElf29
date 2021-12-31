package pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddendivisioPopupOnMakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		
		Actions actions=new Actions(driver);
		actions.click().perform();
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,100);");
		
//		for(;;) {
//			try {
//				driver.findElement(By.xpath("//div[text()='June 2022']/../..//p[text()='14']")).click();
//				break;
//			}catch(NoSuchElementException e) {
//				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//			}
//		}
		//Thread.sleep(3000);
		
		selectCalenderDate(driver,"Dec","10","2022");
		
		
	}

	private static void selectCalenderDate(WebDriver driver, String month, String date, String year) {
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+" "+date+" "+year+"')]")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
	}

}
