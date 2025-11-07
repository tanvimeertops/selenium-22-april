package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	Thread.sleep(2000);
	
	List<WebElement> row= driver.findElements
			(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	List<WebElement> col=driver.findElements
			(By.xpath("/html/body/div[1]/div[3]/div[1]/table/thead/tr/th"));
	int nrow=row.size();
	int ncol=col.size();
	System.out.println("no of row is :"+nrow);
	System.out.println("no of col is :"+ncol);
	
	for (int i = 1; i <nrow; i++) {
		for (int j = 1; j < ncol; j++) {
		System.out.print("   |   "+driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText()); 
		}
		System.out.println();
		Thread.sleep(1000);
	}
}
}
