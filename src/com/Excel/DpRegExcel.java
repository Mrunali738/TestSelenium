package com.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DpRegExcel {
	WebDriver driver = null;
	Workbook wb = null;
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
	
  @Test(priority = 1, dataProvider = "dp")
  public void registerTest(String name, String mobile, String email, String pass ) throws Exception {
	  if(driver.getTitle().contains("Log in")) {
		  driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	  }
	  driver.findElement(By.id("name")).clear();
	  driver.findElement(By.id("name")).sendKeys(name);
	  driver.findElement(By.id("mobile")).clear();
	  driver.findElement(By.id("mobile")).sendKeys(mobile);
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(email);
	  driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
	  Thread.sleep(2000);
	  Alert alert = driver.switchTo().alert();
	  String actual = alert.getText();
	  alert.accept();
	  Assert.assertEquals(actual,"User registered successfully."); 
	 // driver.close();
	  }

  @DataProvider
  public Object[][] dp() throws Exception, Exception {
  FileInputStream fis = new FileInputStream("Test.xls");
  wb = Workbook.getWorkbook(fis);
  Sheet sh = wb.getSheet("login");
  int rows = sh.getRows();
  int cols = sh.getColumns();
 
    String data[][] = new String[rows][cols]; 
    	for(int i=0; i<rows; i++){
    		for(int j=0; j<cols; j++){
    			Cell c = sh.getCell(j,i);
    			String value = c.getContents();
    			data[i][j] = value;
    	}
    }
	return data;
  }
}
