package restAPI;

import org.testng.annotations.Test;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestWithMap {
	
	@Test
	public void test1() {
		
		HashMap<String,String> obj = new HashMap<String,String>();
		
		obj.put("id", "4");
		obj.put("name", "kiran");
		obj.put("salary", "9000");
		
		RestAssured.baseURI = "http://localhost:3000/employees";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body(obj)
									.post();
		
		String resBody = response.getBody().asString();
		int resCode = response.statusCode();
		System.out.println(resBody);
		System.out.println(resCode);
		
	}

	

}
