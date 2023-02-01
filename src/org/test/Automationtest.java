package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishnurekha\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");

	WebElement txtuser = driver.findElement(By.xpath("//input[@type='text'][1]"));
	
	txtuser.sendKeys("vishnu");
	 
	WebElement txtname = driver.findElement(By.xpath("//input[@placeholder='Last Name'][1]"));
	txtname.sendKeys("selvam");
	
	
     
driver.quit();

}
}

