package basics;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Beginning...");
		
		WebDriver driver = null;
	
		System.setProperty("webdriver.chrome.driver", "/Users/adithya/apps/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		// Dynamic dropdown..
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		//Static dropdown : Has 'select' as tag name in xpath
		
			//using usual xpath just to click.. But not to select any option
			// driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
		
			//using Select class of selenium
			
			Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
			dropdown.selectByIndex(0);
			Thread.sleep(2000);
			dropdown.selectByVisibleText("2 Adults");
			Thread.sleep(2000);
			dropdown.selectByValue("3");
			Thread.sleep(2000);
		//	dropdown.deselectByValue("1");
			
			System.out.println("The End!!");
			
			//dropdown
			
	//		Assert.assertTrue(true);
	//		Assert.assertFalse(false);
		
	}

}
