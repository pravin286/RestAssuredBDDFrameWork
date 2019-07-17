package BDDWork;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class GetRequest

{

	@BeforeClass // Will Execute before every @Test
	public void endpointURL() {
		baseURI = "http://localhost:3000";// remains constant for every Get request
		basePath = "/students";

	}

	@Test
	public void getContents() {

		 when()
		.get()
		.then()
		.statusCode(200)//Verification point will check the status code
		.log().all();//Log the response 
}

}
