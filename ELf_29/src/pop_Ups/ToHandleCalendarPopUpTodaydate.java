package pop_Ups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleCalendarPopUpTodaydate {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		LocalDateTime ldt=LocalDateTime.now().plusMonths(6);
		String monthName = ldt.getMonth().toString();
		monthName =monthName.substring(0, 3);
		String month = ""+monthName.substring(0, 1).toUpperCase()+monthName.substring(1, 3).toLowerCase();
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();
		
	driver.get("https://www.makemytrip.com/");
		
		Actions actions=new Actions(driver);
		actions.click().perform();
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,100);");

		selectCalendarDate(driver,month,date,year);
	}

	private static void selectCalendarDate(WebDriver driver, String month, int date, int year) {
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+" "+date+" "+year+"')]")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		
		}
		driver.quit();
		
	}

}
