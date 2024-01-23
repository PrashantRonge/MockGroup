package demo_003;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

public class Demo_004_chaining_using_get_Post 
{
	@Test
	public void test_1()
	{
		Response res = RestAssured.given().baseUri("https://reqres.in/api/users?page=2")
		.when().get()
		.then().extract().response();
		String firstOutput = res.path("data[5].first_name");
		
		JSONObject js = new JSONObject();
		js.put("name",firstOutput );
		js.put("job", "TeamLeader");
		
		RestAssured.given().baseUri("https://reqres.in/api/users")
		.contentType(ContentType.JSON)
		.body(js.toString())
		
		.when().post()
		.then().log().all();
		
	}

	
}
