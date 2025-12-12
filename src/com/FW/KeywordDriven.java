package com.FW;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeywordDriven {
	@DataProvider(name = "tanvi")
	public Object[][] input() throws InvalidFormatException, IOException {
		Object[][] data = null;
		// 1.to open file path
		String filepath = "D:\\Selenium\\data.xlsx";
		// 2.to make file
		File file = new File(filepath);
		// 3.to open a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		// 4.to open a sheet
		Sheet sheet = workbook.getSheet("Sheet2");
		// 5.to evaluate no of rows
		int nrow = sheet.getPhysicalNumberOfRows();
		System.out.println("no of row :" + nrow);
		data = new Object[nrow][];
		// 6.to select a row
		for (int i = 0; i < data.length; i++) {
			Row row = sheet.getRow(i);
			// 6.to evaluate no of col in each row
			int ncol = row.getPhysicalNumberOfCells();
			System.out.println("no of col :" + ncol);
			data[i] = new Object[ncol];
			for (int j = 0; j < data[i].length; j++) {
				Cell cell = row.getCell(j);
				// to convert a data type into string
				cell.setCellType(CellType.STRING);
				data[i][j] = cell.getStringCellValue();
			}
		}

		return data;
	}

	WebDriver driver;

	@Test(dataProvider = "tanvi")
	public void test(String keyword) throws InterruptedException, InvalidFormatException, IOException {

	if (keyword.equalsIgnoreCase("open browser")){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	else if (keyword.equalsIgnoreCase("enterusername")) {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	
	} 
		

	else if (keyword.equalsIgnoreCase("enterpassword")) {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	} 

	else if (keyword.equalsIgnoreCase("click login")) {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
		
	else if (keyword.equalsIgnoreCase("close browser")) {
		driver.close();
	}

	}

}
