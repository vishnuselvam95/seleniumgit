package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishnurekha\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/login");
	
	WebElement txtss = driver.findElement(By.name("username"));
	
	txtss.sendKeys("audi000");
	
	driver.quit();
	
	
	
	
	
}
}
