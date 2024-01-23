package demo_002;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_004 
{
	@Test
	public void getreq1()
	{

		
		Response res = RestAssured.given().baseUri("https://reqres.in/api/users?page=2")
		.when().get()
		
		//status line = HTTP/1.1 200 OK
		//.then().header("Content-Type", "application/json; charset=utf-8")
		.then().header("Vary", "Accept-Encoding")
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.extract().response();
		System.out.println(res.getTime());
		
		
		
	}
	
	
	
	
	
	
	
}
