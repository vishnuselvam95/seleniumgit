package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishnurekha\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://netbanking.hdfcbank.com/");
	
	WebElement txtww = driver.findElement(By.id("fldLoginUserId"));
	txtww.sendKeys("vishnu");
	
	


















}

}
