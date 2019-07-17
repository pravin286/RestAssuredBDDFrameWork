package com.qa.rest.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StoreIntoExcel {
	public static void main(String[] args) throws Exception {

		File src = new File("D:\\as1.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		FileOutputStream fos = new FileOutputStream(src);
		wb.write(fos);
wb.close();
	}
}