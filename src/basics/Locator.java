package basics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Locator {

	public static void main(String[] args) {
		
		//launch Firefox with firebug and firepath extentions
		
		 /*final String firebugPath = "/Users/adithya/Selenium/firebug-2.0.12-fx.xpi";
		   FirefoxProfile profile = new FirefoxProfile();       
		   profile.addExtension(new File(firebugPath));
		   // Add more if needed
		   WebDriver driver = new FirefoxDriver(profile);*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com");
		
		WebElement element;
		
		//driver.findElement(By.xpath(".//*[@id='homepage']/section[2]/div/a")).click();
		element = driver.findElement(By.xpath("//*[@id='homepage']/section[2]/div/a"));
		element.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println("Done");
		//driver.close();
		
		
		
		driver.get("www.facebook.com");
		element = driver.findElement(By.id("email"));
		element.sendKeys("adithyakv149@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("YouAintGonnaGetMyPasswordBiaaaatch");
		//driver.findElement(By.className("uiButton uiButtonConfirm")).click();
		//driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		//System.out.println("Logged in");
		
		driver.findElement(By.partialLinkText("your password")).click();
		
		List<WebElement> links = driver.findElements(By.linkText("a"));
		
		

	}

}
