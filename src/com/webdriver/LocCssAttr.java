package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * except class and id everything else is css attribute
 * tagname[attr_name='value']
 */
public class LocCssAttr {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	
	driver.findElement(By.cssSelector("input[type='text']"))
	.sendKeys("tanvi");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[data-testid='royal-pass']"))
	.sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}
}
