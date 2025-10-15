package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Id {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.id("email")).sendKeys("tanvi@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.id("u_0_5_f2")).click();
	Thread.sleep(2000);
	if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {
		System.out.println("test fail!!!");
	}else {
		System.out.println("test pass!!!");
	}
	
}
}
