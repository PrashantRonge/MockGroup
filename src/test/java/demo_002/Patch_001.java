package demo_002;




import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;


public class Patch_001 
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
		.when().patch("https://reqres.in/api/users/2")
		.then().statusCode(200).statusLine("HTTP/1.1 200 OK")
		.header("Server", "cloudflare").log().all();
		
		
		
	}

}
