package demo_002;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete_001 
{
	@Test
	public void test()
	{
		RestAssured.given().baseUri("https://reqres.in/api/users/2")
		.when().delete()
		.then().statusCode(204).statusLine("HTTP/1.1 204 No Content")
		.log().all();
	}

}
