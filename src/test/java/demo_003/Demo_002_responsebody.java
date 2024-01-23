package demo_003;

import static org.testng.Assert.assertEquals;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Demo_002_responsebody 
{
	
	@Test
	public void test1()
	{

//-------------------1st  req --------------------------------------------------------		
		 Response res = RestAssured.given().baseUri("https://reqres.in/api/users?page=2")
		.when().get()
		.then().extract().response();
		 String actualFname = res.path("data[4].first_name");
		 System.out.println(actualFname);
		 
		 String exPected = "Charles";
		 
		 assertEquals(actualFname, exPected);
		


		
	}

}
