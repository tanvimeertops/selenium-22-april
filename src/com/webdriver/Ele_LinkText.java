package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * link text :
 * partial link text
 * button
 * text box
 * radio button
 * checkbox
 * drop down
 * web table
 */
public class Ele_LinkText {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.facebook.com/");
	
	Thread.sleep(5000);
	driver.findElement(By.linkText("Forgotten password?")).click();
	
}
}
