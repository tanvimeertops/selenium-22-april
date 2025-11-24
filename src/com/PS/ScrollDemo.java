package com.PS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		Thread.sleep(2000);
		WebElement Element = driver.findElement(By.id("userName-label"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
//		driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[8]/div[2]/div/label"))
//		.sendKeys("C:\\Users\\Tops\\Downloads\\WhatsApp Image 2025-09-11 at 10.44.15.jpeg");
		
			driver.findElement(By.id("uploadPicture"))
			.sendKeys("C:\\Users\\Tops\\Downloads\\WhatsApp Image 2025-09-11 at 10.44.15.jpeg");
	}
	
}
