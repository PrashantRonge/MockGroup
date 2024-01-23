package demo_003;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Demo_001_responsebody 
{
	
	@Test
	public void test1()
	{

//-------------------1st  req --------------------------------------------------------		
		Response res = RestAssured.given().baseUri("https://reqres.in/api/users?page=2")
		.when().get()
		.then().extract().response();
		//System.out.println(res.asPrettyString()); //convert json to string
		Object id12 = res.path("data[4].id");
		
//		System.out.println("--------------");
//		System.out.println(id12);

//-------------------2nd req --------------------------------------------------------		
		
		RestAssured.given().baseUri("https://reqres.in/api/users").pathParam("id", id12)
		.when().get("{id}")
		.then().log().all();
		
	}

}
