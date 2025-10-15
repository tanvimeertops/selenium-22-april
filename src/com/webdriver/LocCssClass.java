package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * class
 * tagname.class_value
 */
public class LocCssClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"))
	.sendKeys("tops");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"))
	.sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"))
	.click();
}
}
