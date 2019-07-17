package com.qa.rest.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Matcher.eq


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BDDTutorial 

{

@Test
public void getStatusCode()
{
	
Response res=given().get("http://ergast.com/api/f1/circuits.json");
System.out.println(res.statusCode());



//System.out.println("Status code is"+statusCode);

}

@Test 
public void VerifyEqualTomethod()
{
	
	
	given().get("http://ergast.com/api/f1/circuits.json").then().body("MRData.CircuitTable.Circuits[0].Location.country",equalToIgnoringCase("Australia"));
}

@Test
public void VerifyResponse()
{
get("http://ergast.com/api/f1/circuits.json").then().assertThat().body(arg0, arg1)

}


}
