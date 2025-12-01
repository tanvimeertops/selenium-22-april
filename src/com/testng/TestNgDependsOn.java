package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNgDependsOn {
	WebDriver driver;
	@Test
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = "before")
	public void EnterUsername() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = "EnterUsername")
	public void EnterPassword() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = "EnterPassword")
	public void ClickLogin() {
		driver.findElement(By.id("login-button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods = "ClickLogin")
	public void close() {
		driver.close();
	}
}
