package javaScriptExecutor;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait=new WebDriverWait(driver,10);

		driver.get("https://www.urbanladder.com/");
		String parentWindow = driver.getWindowHandle();

		Actions actions=new Actions(driver);

		actions.moveToElement(driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"))).perform();
		driver.findElement(By.xpath("//span[text()='Lounge Chairs']")).click();

		driver.findElement(By.linkText("Close")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("(//ul[@class='productlist withdivider clearfix lounge_chairs productgrid']/li[3]//span)[2]")).getText();
		System.out.println(price);
		char[] priceAr=price.toCharArray();

		String cost="";
		for(char p:priceAr) {
			if(p>=48 && p<=57) {
				cost=cost+p;
			}
		}

		int productCost=Integer.parseInt(cost);

		if(productCost>=20000) {
			System.out.println("product is more than 20000 ");
		}else {
			System.out.println("product is less than 20000");
		}
		driver.findElement(By.xpath("//ul[@class='productlist withdivider clearfix lounge_chairs productgrid']/li[3]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		allWindows.remove(parentWindow);

		for(String w:allWindows) {
			driver.switchTo().window(w);

		}
		driver.findElement(By.xpath("//button[@data-variantname='(Floral)']")).click();

	}
}


