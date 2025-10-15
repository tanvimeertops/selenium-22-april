package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:\\eclipse projects\\Selenium_22_April\\src\\com\\webdriver\\index1.html");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/a")).click();
}
}
