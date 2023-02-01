package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vishnurekha\\\\eclipse-workspace\\\\Browserlaunch\\\\driver\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	
	WebElement txt = driver.findElement(By.id("src"));
	
	txt.sendKeys("chennai");
	
	WebElement tet = driver.findElement(By.id("dest"));
	
	tet.sendKeys("salem");
	
	driver.quit();
	
	
}
}
