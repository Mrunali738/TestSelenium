package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestExcel {
    @Test
	//public static void main(String[] args) throws Exception {
		public void Test() throws Exception {
		FileInputStream fis = new FileInputStream("Test.xls");
		Workbook wb= Workbook.getWorkbook(fis);
		Sheet sh= wb.getSheet("login");
		
		int rows = sh.getRows();// 3		
		int col = sh.getColumns();// 4
		System.out.println(rows +"   "+col);
		
		for(int i=0;i<rows;i++) {// for rows
			for(int j=0;j<col;j++) {// for cols
				
				Cell ce = sh.getCell(j, i);	
				String data = ce.getContents();
				System.out.print(data+"    ");
				
				
			}
			System.out.println();
		}
		
	}

}
