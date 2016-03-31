package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptAlerts {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@type= 'button' and @value= 'Confirmation Alert']")).click();
		driver.findElement(null);
		
		String alertContent = driver.switchTo().alert().getText();
		System.out.println(alertContent);
		
		
		//driver.switchTo().alert().sendKeys("ABCD"); // If the pop-up has the text field to enter the text and then accepting it
		//Switch to javascript alert and accept
		Thread.sleep(2000);
		driver.switchTo().alert().accept();			//accept = ok done yes : FOR A POSITIVE SCENARIO
		
		System.out.println("The End!!");
		//driver.switchTo().alert().dismiss();		//dismiss = cancel close no : FOR A NEGATIVE SCENARIO
		

	}

}
