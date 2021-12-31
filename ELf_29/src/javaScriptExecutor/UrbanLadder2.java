package javaScriptExecutor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbanLadder2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait=new WebDriverWait(driver,10);

		driver.get("https://www.urbanladder.com/");
		String expectedHomePageTitle = "Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder";
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("HomePage displayed Successfully");
		}else {
			System.err.println("HomePage Not displayed Successfully");
		}

		driver.findElement(By.id("search")).sendKeys("study table",Keys.ENTER);
		driver.findElement(By.linkText("Close")).click();

		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//li[@data-group='price']"))).perform();
		String parentWindow = driver.getWindowHandle();
	//	Thread.sleep(2000);
		
		WebElement  rightdrag = driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']"));
	//	Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(rightdrag));
		actions.dragAndDropBy(rightdrag, 48, 0).perform();
		

		WebElement leftdrag = driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-upper']"));
		actions.dragAndDropBy(leftdrag, -215, 0).perform();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='productlist small-block-grid-3']/li[4]")));

		WebElement product = driver.findElement(By.xpath("//ul[@class='productlist small-block-grid-3']/li[4]"));
		System.out.println(product.getText());
		wait.until(ExpectedConditions.visibilityOf(product));
		product.click();
		
	Set<String> allwindowIds = driver.getWindowHandles();
	allwindowIds.remove(parentWindow);
		for(String windowid:allwindowIds) {
			driver.switchTo().window(windowid);
		}
		
		WebElement warrenty = driver.findElement(By.xpath("//div[@class='warranty-details']"));
		System.out.println(warrenty.getText());
		
		WebElement addCartButton = driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[2]"));
		addCartButton.click();
	}
	

}
