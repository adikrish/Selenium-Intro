package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvocation {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
