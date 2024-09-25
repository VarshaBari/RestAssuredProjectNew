package restAPI;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	@Test
	public void test1() {
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
				
		String resBody = response.getBody().asString();
		int resCode = response.statusCode();
		System.out.println(resBody);
		System.out.println(resCode);

	}


}
