package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		//Using OR operator in xpath
		List<WebElement> listOfRadioButtons = driver.findElements(By.xpath("//input[@name='group1'] | //input[@name='group2']"));
		int count = listOfRadioButtons.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			listOfRadioButtons.get(i).click();
			System.out.println("Clicked on "+ listOfRadioButtons.get(i).getAttribute("value"));
			Thread.sleep(1000);
		}
		
		for(int i=0; i<count; i++)
		{
			
			String value = listOfRadioButtons.get(i).getAttribute("value"); 
			if(value.equalsIgnoreCase("Beer"))
			{
				listOfRadioButtons.get(i).click();
				System.out.println("Kudos.. Beer found");
			}
			
		}
		driver.quit();
	}

}
