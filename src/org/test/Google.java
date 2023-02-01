package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishnurekha\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.google.com/");
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	WebElement txttt = driver.findElement(By.name("q"));
	txttt.sendKeys("Greenstech");
	driver.quit();
}
	
	
	
	
	
	
}
