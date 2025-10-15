package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Css Selector: 
 * id
 * class
 * attribute
 * 
 * id :
 * tagname#id
 */
public class LocCssSelector {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	
	driver.findElement(By.cssSelector("input#email")).sendKeys("tanvi");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#pass")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button#u_0_5_YT")).click();
}
}
