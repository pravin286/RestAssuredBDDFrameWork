package BDDWork;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostRequest

{

	public static HashMap<String, String> map = new HashMap();

	@BeforeClass
	public void PostData() {

		map.put("name", RestUtil.getFname());
		map.put("lname", RestUtil.geLastname());

		map.put("email", RestUtil.getEmail());
		map.put("roll", RestUtil.getrollno());

		baseURI = "http://localhost:3000/students";
		// RestAssured.basePath="/students";
	}

	@Test
	public void testpostRequest() {

		given()
		.contentType("application/json")
		.body(map)
		.when()
		.post()
		.then()
		.statusCode(201)
		.log()
		.all();

	}

}
