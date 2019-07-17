package BDDWork;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutRequest 

{

public static HashMap map=new HashMap();


@BeforeClass
public void putDemo()
{
	map.put("name","Kiran");
	map.put("lname", "jadhav");
	int studid=3;
	
	RestAssured.baseURI="http://localhost:3000/students";
	RestAssured.basePath=""+studid;

}

@Test
public void testputRequest()
{
	
given().
contentType("application/json").body(map).
when().
put().
then().
statusCode(200).log().all();

}
}

