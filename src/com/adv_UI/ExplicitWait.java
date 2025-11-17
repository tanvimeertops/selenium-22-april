package com.adv_UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath
			("//*[@id=\"post-body-7708391096228750161\"]/button")).click();
	Thread.sleep(2000);
	
	
	WebElement myElement=wait.until(ExpectedConditions.visibilityOfElementLocated
			(By.xpath("//p[text()='WebDriver']")));
	System.out.println(myElement.getText());
}
}
