package com.qa.rest.test;

import org.testng.annotations.Test;

import groovyjarjarantlr.collections.List;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.Content;


public class CircuitInformation 

{
@Test
public void getresponse()
{
	
Response resp1=get("http://ergast.com/api/f1/circuits");

//ArrayList ls=new ArrayList();
long lengh=resp1.contentType().j
//System.out.println();

//byte[] b1=resp1.body().toString().getBytes();
//int code=resp1.getStatusCode(); 
System.out.println(lengh);

}
	
	
}
