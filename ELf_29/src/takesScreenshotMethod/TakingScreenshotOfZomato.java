package takesScreenshotMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshotOfZomato {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.zomato.com/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	File screenshot=ts.getScreenshotAs(OutputType.FILE);
	System.out.println(screenshot);
	Thread.sleep(10000);
	File destfile=new File("./errorimages/img1.png");
	screenshot.renameTo(destfile);
	
	

	}

}
