package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWidthOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.album.alexflueras.ro");
		
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		for(;;) {
		
				//Js.executeScript("window.scrollTo(document.body.scrollWidth,0);");
				Js.executeScript("window.scrollBy(1000,0);");
		}
		

	}

}
