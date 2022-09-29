package testPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testClass {
	 WebDriver drvr;
	
	public static void main(String[] args) {
		testClass obj = new testClass();
		WebDriverManager.chromedriver().setup();
		obj.drvr = new ChromeDriver();
		obj.drvr.get("https://www.flipkart.com/");
		
		}

}
