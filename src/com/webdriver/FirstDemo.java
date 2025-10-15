package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
	public static void main(String[] args) throws InterruptedException {
	//to make bride between browser and code
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		//to open empty browser
		WebDriver driver=new ChromeDriver();
		//to open website
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println("website url :"+driver.getCurrentUrl());
		Thread.sleep(5000);
		System.out.println("get title name: "+driver.getTitle());
		Thread.sleep(2000);
//		driver.close();//to close tab
		
		driver.quit();//to close browser
		
	}

}
