package SeleniumAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowidsInAlphabeticalOrderInNaukri {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.naukri.com/");
	Set<String> windowids = driver.getWindowHandles();

	for(String s:windowids) {
	System.out.println(s);
		
	}


	}

}
