package com.Excel;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class DpWithExcel {
	public static WebDriver driver = null;
				Workbook wb = null;
	@BeforeSuite
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
	}
	@AfterSuite
	public void tearDown() {
		driver.close();// it will close only current window
		//driver.quit();// it will close all windows/tabs.
	}
	
  @Test(priority =1, dataProvider = "dp")
  public void loginTest(String uname, String pass) {
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	  
	  if(driver.getTitle().contains("Dashboard"))
		  driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).click();
	  Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
  }

  @DataProvider
  public Object[][] dp() {
	  
    try {
	  FileInputStream fis = new FileInputStream("Test.xls");
	 wb= Workbook.getWorkbook(fis);
    }catch(Exception e) {
    	e.printStackTrace();
    }
	  Sheet sh= wb.getSheet("login");
	  int rows= sh.getRows();//3
	  int col = sh.getColumns();//2
	  
	  String data[][]= new String [rows][col];//[3][2]
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				Cell c = sh.getCell(j,i);
				String value = c.getContents();
				data[i][j]=value;
			}
		}
	return data;	
  }
}
