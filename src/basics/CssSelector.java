package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("Adithyakv");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("adithyakv149");
	//	driver.findElement(By.xpath(".//button[@id='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		
		//driver.quit();

	}

}
