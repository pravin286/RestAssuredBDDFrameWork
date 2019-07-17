package com.qa.rest.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PostRequest 

{

@Test

public void postRequest()
{
	
	given().header("Content-Type","application/json").body("{\"email\":\"sydney@fife\"}").body("{\"password\":\"pistol\"}").
    
    
	
	when().post("https://reqres.in/api/register.json").then().statusCode(201).log().all();


}

}
