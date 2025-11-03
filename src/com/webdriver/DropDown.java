package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.name("country"));
	Select s1=new Select(ele);
//	s1.selectByVisibleText("INDIA");
	for (int i=5 ;i<=12;i++) {
		s1.selectByIndex(i);
		Thread.sleep(2000);
	}
	
}	
}
