package basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxWithExtentions {

	public static void main(String[] args) {
		//launch Firefox with firebug and firepath extentions
		
		 final String firebugPath = "/Users/adithya/Selenium/firebug-2.0-fx.xpi";
		 final String firepathPath = "/Users/adithya/Selenium/firepath-0.9.7-fx.xpi";
		   FirefoxProfile profile = new FirefoxProfile();       
		   try {
			profile.addExtension(new File(firebugPath));
			profile.addExtension(new File(firepathPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		   // Add more if needed
		   WebDriver driver = new FirefoxDriver(profile);
		   
		  // System.out.println("I am here bhench**");
		   driver.get("www.google.com");
		   //driver.close();
		   
	}

}
