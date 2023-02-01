package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishnurekha\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");
	

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com//");

WebElement txtusername = driver.findElement(By.id("email"));
txtusername.sendKeys("meghavenkat");


WebElement txtpassword = driver.findElement(By.id("pass"));

txtpassword.sendKeys("55555555");

driver.quit();

}
}
