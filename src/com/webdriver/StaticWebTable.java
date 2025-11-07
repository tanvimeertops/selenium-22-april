package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:\\eclipse projects\\Selenium_22_April\\src\\com\\webdriver\\index2.html");
	Thread.sleep(2000);
	
//	List<WebElement> row= driver.findElements(By.xpath("/html/body/table/tbody/tr"));
//	System.out.println(row.size());
//	///html/body/table/tbody/tr
//	List<WebElement> col= driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
//	System.out.println(col.size());
	////html/body/table/tbody/tr[1]/th
	String data=null;
	for(int i=2;i<=5;i++) {
		for (int j=1;j<=4;j++) {
			data= driver.findElement(By.xpath
	("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
///html/body/table/tbody/tr[1]/th[1]
			System.out.print("   |   "+data);
		}
		System.out.println();
	}

}
}
