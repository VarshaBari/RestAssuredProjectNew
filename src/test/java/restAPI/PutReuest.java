package restAPI;

import org.testng.annotations.Test;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutReuest {
	
	@Test
	public void test1() {
		
		HashMap<String,String> obj = new HashMap<String,String>();
		
		obj.put("id", "1");
		obj.put("name", "Pankaj");
		obj.put("salary", "11000");
		
		RestAssured.baseURI = "http://localhost:3000/employees";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body(obj)
									.put("/1");
		
		String resBody = response.getBody().asString();
		int resCode = response.statusCode();
		System.out.println(resBody);
		System.out.println(resCode);
		
	}

	



}
