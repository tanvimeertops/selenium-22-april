package com.FW;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDriven {
public String[][] input() throws InvalidFormatException, IOException {
	String[][] data=null;
	//1.to open file path
	String filepath="D:\\Selenium\\data.xlsx";
	//2.to make file
	File file=new File(filepath);
	//3.to open a workbook
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	//4.to open a sheet
	Sheet sheet =workbook.getSheet("Sheet1");
	//5.to evaluate no of rows
	int nrow=sheet.getPhysicalNumberOfRows();
	System.out.println("no of row :"+nrow);
	data=new String[nrow][];
	//6.to select a row
	for (int i = 0; i < data.length; i++) {
		Row row=sheet.getRow(i);
		//6.to evaluate no of col in each row
		int ncol=row.getPhysicalNumberOfCells();
		System.out.println("no of col :"+ncol);
		data[i]=new String[ncol];
		for (int j = 0; j < data[i].length; j++) {
			Cell cell=row.getCell(j);
			//to convert a data type into string
			cell.setCellType(CellType.STRING);
			data[i][j]=cell.getStringCellValue();
		}
	}
	
	
	
	return data;
}

@Test
public void test() throws InterruptedException, InvalidFormatException, IOException {
	String[][] data=input();
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	for (int i = 0; i < data.length; i++) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("user-name")).sendKeys(data[i][0]);
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys(data[i][1]);
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
	}
	
	
	
	
	
}

}
