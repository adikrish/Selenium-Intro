package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@value='multi_city']")).click();
		//driver.findElement(By.xpath("//input[@id='from_typeahead1']")).sendKeys("Bangalore");	//.click();
		//driver.findElement(By.xpath("//input[@id='from_typeahead1']")).sendKeys(Keys.RETURN);
		
		
	}

}
