package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishnurekha\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get(" http://adactinhotelapp.com/");
	WebElement txtoo = driver.findElement(By.name("username"));
	txtoo.sendKeys("vishnu");
	
	WebElement txtpp = driver.findElement(By.id("password"));
	txtpp.sendKeys("852366");
	
	driver.quit();
}
}
