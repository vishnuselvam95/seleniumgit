package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4icici {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishnurekha\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	

}
}
