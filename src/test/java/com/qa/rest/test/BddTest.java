package com.qa.rest.test;

import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.util.concurrent.TimeUnit;
public class BddTest {

	@Test
	public void CircuitsIn2017() {

		given().when().get("http://ergast.com/api/f1/1955/circuits.json").then().assertThat().statusCode(200).and()
				.body("MRData.CircuitTable.Circuits.Location.lat[1]", equalTo("-34.6943"));

	}

	@Test
	public void getResponceTime() throws IOException {

		String SensorAL = "AL";
		String SensorPIR = "PIR";
		Response responce = get("http://ergast.com/api/f1/1955/circuits.json");
		long timeINMs = responce.time();
		// long timeINSecond=responce.timeIn(TimeUnit.SECONDS);
		// System.out.println("Responce time in MiliSeconds::-->"+timeINMs);
		// assertEquals(timeINSecond,timeINMs/1000);
		System.out.println(timeINMs);

		File src=new File("D:\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = workbook.getSheetAt(0);
		//int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		//Row row = sheet.createRow(rowCount + 1);
		sheet1.getRow(0).createCell(2).setCellValue("PASS");
		
		//sheet.getRow(0).createCell(2).setCellValue("PADMAN");
//		Cell cell = row.createCell(0);
//		row.createCell()
//		Cell cell1 = row.getRowNum(2);
//		Cell cell2 = row.createCell(2);
//        cell.setCellType(cell.CELL_TYPE_STRING);
//        cell.setCellValue("PASS");
//		cell1.setCellValue(timeINMs);
//		cell2.setCellValue(SensorPIR);
	
		
		FileOutputStream fos = new FileOutputStream(src);
	workbook.write(fos);
	fos.close();
//
//	}

//	@Test
//	public void hgetStatuscode() throws IOException 
//	{
//		Response responce = get("http://ergast.com/api/f1/1955/circuits.json");
//		long statuscode = responce.statusCode();
//		
//	
//		FileInputStream fis = new FileInputStream("D:\\TestData.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
//		//Row row = sheet.createRow(rowCount +2);
//		sheet.getRow(2).createCell(4).setCellValue("Pass");
//		
//		//Cell cell = row.createCell(0);
//		//Cell cell3 = row.createCell(1);
//		//Cell cell2 = row.createCell(3);
//		//cell2.setCellType(cell2.CELL_TYPE_STRING);
//		
//		//cell2.setCellValue(statuscode);
//		FileOutputStream fos = new FileOutputStream("D:\\TestData.xlsx");
//		workbook.write(fos);
//		fos.close();
//	
	
	}
}
