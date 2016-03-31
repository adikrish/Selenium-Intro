package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Chromedriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/adithya/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new SafariDriver();
		
		driver.get("http://facebook.com");
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		

	}

}
