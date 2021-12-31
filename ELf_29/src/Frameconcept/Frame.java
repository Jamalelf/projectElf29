package Frameconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait=new WebDriverWait(driver, 10);



		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123"+Keys.ENTER);
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("jamal");

		//Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));

		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("hai sir,i am jamal"+Keys.ENTER+"Regards JAMAL");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Send']")).click();

		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='jamal']/..//cite[@title='Select mail']")).click();
		//	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='jamal']/..//a[@title='Delete mail']")).click();

	}
}

