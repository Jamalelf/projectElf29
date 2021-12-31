package Automation;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());

	Set<String> windowids = driver.getWindowHandles();
	int count=1;
	
	for(String s:windowids) {
	driver.switchTo().window(s);
	System.out.println("Switching for the "+count+"loop");
	System.out.println(driver.getTitle());
	count++;

	}
	driver.close();

	}

}
