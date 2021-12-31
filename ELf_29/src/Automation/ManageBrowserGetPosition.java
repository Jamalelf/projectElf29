package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageBrowserGetPosition {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new  ChromeDriver();
	driver.get("https://www.instagram.com/");
	Point pos= driver.manage().window().getPosition();
	System.out.println(pos);
	driver.close();

	}

}
