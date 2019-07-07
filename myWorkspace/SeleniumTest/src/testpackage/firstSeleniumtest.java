package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstSeleniumtest {
	
	public static void main(String[] args) {
		
		String projectlocation = System.getProperty("user.dir");
				
		System.out.println("project location is "+projectlocation);
		
		System.out.println("Lets check if this works");
		
		System.setProperty("webdriver.gecko.driver", projectlocation+"\\libs\\geckodriver\\geckodriver.exe");
//		System.setProperty("webdriver.firefox.bin", "")
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		
		driver.quit();
				
		System.out.println("Oh God !! It did work");

	}

}
