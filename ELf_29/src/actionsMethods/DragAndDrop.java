package actionsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("jamalrockz9@gmail.com");
		wait.until(ExpectedConditions.invisibilityOfElementLocated((By.id("password"))));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Jamal@2000");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[text()='seleniumPractice']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='list-card-title js-card-name']")));
		WebElement sourcefile = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		WebElement targetFile = driver.findElement(By.xpath("//h2[text()='Doing']/../..//a[@class='open-card-composer js-open-card-composer']"));
		
		Actions actions=new Actions(driver);
		
		//actions.dragAndDrop(sourcefile, targetFile).perform();
		actions.clickAndHold(sourcefile).perform();
	}

}
