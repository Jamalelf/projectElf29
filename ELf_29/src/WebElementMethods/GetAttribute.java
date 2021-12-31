package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
		
		String t = driver.findElement(By.xpath("//input[@placeholder='Password']")).getAttribute("placeholdr");
System.out.println(t);
	}

}
