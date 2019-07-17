package BDDWork;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteRequest 

{

//public static HashMap map=new HashMap();
   @Test
   public void deleteRequest()
   {

	RestAssured.baseURI="http://localhost:3000/students/";
	RestAssured.basePath=""+4;
	Response res=
	given().
	//contentType("application/json").
	when().
	delete().
	then().
	statusCode(200).log().all().extract().response();
	
	System.out.println(res);
}
   }
