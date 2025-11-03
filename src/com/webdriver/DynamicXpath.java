package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *  //tagname[@attr_name='attr value']
 *  //tagname[text()='value']
 */
public class DynamicXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("file:///D:\\eclipse projects\\Selenium_22_April\\src\\com\\webdriver\\index2.html");
	driver.get("https://demo.guru99.com/test/selenium-xpath.html");
	Thread.sleep(5000);
//	String val=driver.findElement(By.xpath("//td[text()='jyoti']")).getText();
//	System.out.println(val);
	
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("123");
	Thread.sleep(2000);
	String val= driver.findElement(By.xpath("//b[text()='Testing']")).getText();
	System.out.println(val);
	
}
}
