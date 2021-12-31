package pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleJavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.marimallappawomenscollege.org/contactus.php?current=contactus");
		driver.findElement(By.name("name")).sendKeys(Keys.ENTER);
		
		Alert popUpalert = driver.switchTo().alert();
		System.out.println(popUpalert.getText());
		popUpalert.dismiss();
		
		driver.findElement(By.name("name")).sendKeys("jhcgsfd");
		driver.findElement(By.name("Send")).click();
		
		Thread.sleep(2000);
		
		popUpalert.accept();
		

	}

}
