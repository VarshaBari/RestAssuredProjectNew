package restAPI;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteReuest {
	@Test
	public void test() {
	
		RestAssured.baseURI = "http://localhost:3000/employees";
	RequestSpecification request = RestAssured.given();
			Response response = request.delete();
			String resBody = response.getBody().asString();
			int resCode = response.statusCode();
			System.out.println(resCode);
		
			
			
		

}
}

