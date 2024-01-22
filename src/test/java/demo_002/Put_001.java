package demo_002;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Put_001 
{
	@Test
	public void Test_1()
	{
		JSONObject j1 = new JSONObject();
		j1.put("name", "RamKanya");
		j1.put("job", "TestLead");
		
		RestAssured.given()
		.header("Content-Type" ,"Application/json")
		.contentType(ContentType.JSON)
		.body(j1.toJSONString())
		.when().put("https://reqres.in/api/users/2")
		.then().statusCode(200).statusLine("HTTP/1.1 200 OK")
		.header("Server", "cloudflare").log().all();
		
		
		
	}

}
