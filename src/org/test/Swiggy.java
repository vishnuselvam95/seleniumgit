package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishnurekha\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get(" https://www.swiggy.com/");
	
	WebElement txtaa = driver.findElement(By.name("location"));
	txtaa.sendKeys("omr");
	
	driver.quit();
	
}
}
