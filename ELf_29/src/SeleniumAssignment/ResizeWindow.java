package SeleniumAssignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	Dimension dim = new Dimension(100, 200);
	driver.manage().window().setSize(dim);

	}

}
