package demo_002;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Post_002 
{
	@Test
	public void Test_1()
	{
		JSONObject j1 = new JSONObject();
		j1.put("name", "Ram");
		j1.put("job", "Tester");
		
		RestAssured.given()
		.header("Content-Type" ,"Application/json")
		.contentType(ContentType.JSON)
		.body(j1.toJSONString())
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).statusLine("HTTP/1.1 201 Created")
		.header("Content-Length", "79").log().all();
		
		
		
		
	}

}
