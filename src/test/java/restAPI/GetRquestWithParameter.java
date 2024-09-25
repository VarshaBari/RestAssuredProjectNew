package restAPI;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRquestWithParameter {
	@Test
	public void test1() {

		RestAssured.baseURI = "https://reqres.in/api/users";

		RequestSpecification request = RestAssured.given();

		Response response = request.get("/3");

		String resBody = response.getBody().asString();
		int resCode = response.statusCode();
		System.out.println(resBody);
		System.out.println(resCode);
		
		AssertJUnit.assertEquals(resCode, 200);
		AssertJUnit.assertTrue(resBody.contains("Emma")); //partially correct
		
		JsonPath json = response.jsonPath();
		String fristName = json.get("data.first_name");
		System.out.println(fristName);
		AssertJUnit.assertEquals(fristName, "Emma");

	}


}
