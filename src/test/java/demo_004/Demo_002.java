package demo_004;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Demo_002 
{

	
	@Test
	public void test_1() throws IOException
	{
		
		
		RestAssured.given().baseUri("https://reqres.in/api/users?page=2")
		.when().get()
		.then().body("data[1].first_name", Matchers.equalTo("Janet"))
		.body("support.text", Matchers.equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"))
		.statusCode(200);
		
	}
	
}
