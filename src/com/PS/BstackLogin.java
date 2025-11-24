package com.PS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 */
public class BstackLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://bstackdemo.com/signin");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"username\"]/div/div[2]/div"))
	.click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='image_not_loading_user']"))
	.click();
	Thread.sleep(2000);
}
}
