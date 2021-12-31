package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMyntra {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("(//b[text()='trainee'])[2]"));

	}

}
