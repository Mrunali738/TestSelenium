package com.Excel;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {
	public String getData(int row, int col) throws Exception {
		FileInputStream fis = new FileInputStream("Test.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("login");
		Cell c = sh.getCell(col, row);
		return c.getContents() ;	
	}
	
	@Test
  public void verifyLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(getData(0,0));
		driver.findElement(By.id("password")).sendKeys(getData(0,1));
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
}
