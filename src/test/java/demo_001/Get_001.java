package demo_001;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_001 
{
	@Test
	public void getUse()
	{
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());           //only body get in console
		System.out.println(resp.asPrettyString());
		
		
	}
	

}
