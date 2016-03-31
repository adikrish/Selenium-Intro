package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/adithya/Selenium/chromedriver");
		WebDriver driver = null;
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
		
		emailBox.sendKeys("adithyakv149@gmail.com");		
		
		emailBox = driver.findElement(By.xpath("//*[@type='email']"));
		emailBox.clear();
		emailBox.sendKeys("adithyakrishnabhat@gmail.com");
		
		/*driver.findElement(By.xpath("//*[@id='loginbutton']")).click();

		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("8123169742");
		//driver.quit();
*/		

		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div/div/input")).sendKeys("Adithya");
	}

}
