package com.qa.rest.test;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PoiApp {

	public static void main(String[] args) throws IOException {

		

			// Specify the file path which you want to create or write

			File src = new File("D:\\asp.xlsx");

			// Load the file

			FileInputStream fis = new FileInputStream(src);

			// load the wokbook

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// get the sheet which you want to modify or create

			XSSFSheet sh1 = wb.getSheetAt(0);

			// // getRow specify which row we want to read and getCell which
			// column
			//
			// System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			//
			// System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			//
			// System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			//
			// System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			//
			// System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
			//
			// System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			//
			// here createCell will create column

			// and setCellvalue will set the value

			sh1.getRow(0).createCell(2).setCellValue("Pass");

//			sh1.getRow(1).createCell(2).setCellValue("2.5");
//
//			sh1.getRow(2).createCell(2).setCellValue("2.39");

			// here we need to specify where you want to save file

			FileOutputStream fout = new FileOutputStream(new File("D:\\asp.xlsx"));

			// finally write content

			wb.write(fout);
			wb.close();
			
		
		

	}

}
