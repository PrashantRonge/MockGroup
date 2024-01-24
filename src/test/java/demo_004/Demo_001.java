package demo_004;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Demo_001 
{

	@Test
	public void test_1() throws IOException
	{
		File file = new File("C:\\Users\\Prashant\\eclipse-workspace\\RestAssured_1st\\utils\\post.txt");
		String pbody = FileUtils.readFileToString(file , "UTF-8");
		
		RestAssured.given().baseUri("https://reqres.in/api/users")
		.contentType(ContentType.JSON).body(pbody)
		.when().post()
		.then().statusCode(201).statusLine("HTTP/1.1 201 Created")
		.body("name", Matchers.equalTo("Narendra Modi"))
		.log().all();
	}
	
}
