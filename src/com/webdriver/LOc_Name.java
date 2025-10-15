package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOc_Name {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	//to maximise window
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys("tops@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("pass")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(10000);
	
	driver.close();
}
}
