package actionsMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformShiftKeyPressAndKeyRelease {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.kalkifashion.com/");
		Actions actions=new Actions(driver);
		driver.findElement(By.id("desktop-nav"));
		List<WebElement> navElements = driver.findElements(By.xpath("//ul[@id='desktop-nav']/li"));
		actions.keyDown(Keys.SHIFT).perform();
		
		for(WebElement nav:navElements) {
			nav.click();
		}
		actions.keyUp(Keys.SHIFT).perform();
	}

}
