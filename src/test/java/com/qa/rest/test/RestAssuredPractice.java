package com.qa.rest.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
//import org.testng.Assert;
import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import io.restassured.http.ContentType;
//import io.restassured.response.Response;

public class RestAssuredPractice

{
  
	
	Properties prop=new Properties();
	@BeforeClass
	public void loadURL() throws IOException
	{
		
	FileInputStream fis=new FileInputStream("C:\\Users\\pravin\\workspace\\RestAssuredBDDFrameWork\\src\\test\\java\\imput.properties");
	prop.load(fis);
	}
	
	
	@Test
	public void checkStatusCode() {

		get(prop.getProperty("url")).then().statusCode(200);
		// int code=res.getStatusCode();
		// System.out.println(code);
		// Assert.assertEquals(code, 200,"Status code Not matched as Expected");

	}

	//Verify and print response
	@Test
	public void VerifycodeAndprintResponse() {
	get("http://ergast.com/api/f1/circuits.json").then().statusCode(200).log().headers();
	//System.out.println(time+"Ms");

	 }

	// Verify EqualToMethodInresponse
	@Test
	public void EqualToMethod() {
		get("http://ergast.com/api/f1/circuits.json").then().body("MRData.CircuitTable.Circuits[6].Location.country",
				equalToIgnoringCase("gerMany"));

	}

	// Verify Hasitem Function

	@Test
	public void verifyHasItems() {
		get("http://ergast.com/api/f1/circuits.json").then().body("MRData.CircuitTable.Circuits.Location.country",
				hasItems("Australia", "Germany"));

	}

	// Verify Multiple Content

	@Test
	public void testMultipleThings() {
		get("http://ergast.com/api/f1/circuits.json").then()
				.body("MRData.CircuitTable.Circuits[3].Location.country", equalTo("Australia"))
				.body("MRData.CircuitTable.Circuits[3].Location.locality", equalTo("Melbourne")).and().statusCode(200);
	}

	//Get Response in String
	
	public void getResponseInString()
	
{
	String responseString=get("http://ergast.com/api/f1/circuits.json").asString();
	
	System.out.println(responseString);
		
		
	}

//Verify Response type
	
	@Test
	public void responseType()
	{
		
		get("http://ergast.com/api/f1/circuits.json").then().contentType(ContentType.XML).statusCode(200);
	} 

//Verify some expected data is present in the response or not
	
	

// Setting up roo

@Test
public void attachingRoot()
{
get("http://ergast.com/api/f1/circuits.json").then().
root("MRData.CircuitTable.Circuits[3].Location").body("country",equalTo("Australia")).body("locality",equalTo("Melbourne"));


}
}

