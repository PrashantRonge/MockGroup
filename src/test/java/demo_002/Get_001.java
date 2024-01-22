package demo_002;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_001 
{
	@Test
	public void getreq1()
	{
		//given
		RestAssured.given().baseUri("https://reqres.in/api/users?page=2")
		//action
		.when().get()
		//response
		.then().statusCode(200).log().all();
	}
	
	
	
	
	
	
	
}
