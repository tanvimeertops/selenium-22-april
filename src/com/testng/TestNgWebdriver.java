package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgWebdriver {

	WebDriver driver;
	@BeforeClass
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test(priority = 0)
	public void EnterUsername() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void EnterPassword() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void ClickLogin() {
		driver.findElement(By.id("login-button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
}
