package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book.goindigo.in");
		driver.findElement(By.xpath(".//*[@id='service']/div/div[2]/div[2]/input[@value='OK']")).click();
		

	}

}
