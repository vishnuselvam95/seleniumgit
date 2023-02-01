package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishnurekha\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	WebElement txtyy = driver.findElement(By.name("username"));
	txtyy.sendKeys("vishnu");
	
	WebElement txtyt = driver.findElement(By.id("password"));
	txtyt.sendKeys("55555");
	driver.quit();
}
}
