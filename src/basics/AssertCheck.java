package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssertCheck {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		
		String title = driver.getTitle();
		System.out.println("Title "+ title);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL "+ url);
		
		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains("ADULT"));
		
		//Check if Flight+Hotel combo button link is getting displayed
		Assert.assertTrue(driver.findElement(By.xpath(".//a[@id='fph_submit']")).isDisplayed());
		System.out.println("'Filght+Hotel Combo' button is found");
		
		//Here use of brackets is to make it work as indexed array??
		//NOT WORKING : driver.findElement(By.xpath("(//*[@class='clearfix'])[2]/span")).click();
		WebElement interTab = driver.findElement(By.xpath(".//a[@href='http://www.makemytrip.com/international-flights']"));
		Assert.assertEquals(interTab.getText(), "International");
		interTab.click();
		
		System.out.println("'Clicked on International tab");
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
		System.out.println("Clicked on Multi city radio button");
		Thread.sleep(2000L);
		
		//Fail if return date gets displayed
		Assert.assertFalse(driver.findElement(By.id("return_date_sec")).isDisplayed());
		System.out.println("Checked for return date option: Its not displayed");
		
		//Check Error is not getting thrown before clicking on 'Search Flights' button
		//PS : "//" here checks with all the child nodes, if "/" it checks for immediate successor
		Assert.assertFalse(driver.findElement(By.xpath("//*[@class='modify_search']//*[@class='alert alert-danger warnings warning_message']//*")).isDisplayed());
	
		/*
		 
		 Multiple xpath options for error message 
		 
	---->	//*[@id='widget_row']//*[@class='alert alert-danger warnings warning_message']//*
	---->	//*[@class='modify_search']//*[@class='alert alert-danger warnings warning_message']//*
		
		*/
		
		//click on 'Search Flights' --- no other fields are set. So it should throw and error
		driver.findElement(By.id("flights_submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='widget_row']//*[@class='alert alert-danger warnings warning_message']")).isDisplayed());
	
		String error = driver.findElement(By.xpath("//*[@class='modify_search']//*[@class='alert alert-danger warnings warning_message']")).getText();
		System.out.println("And the error is :  "+ error);
		
		System.out.println("The End!!");
	}

}
