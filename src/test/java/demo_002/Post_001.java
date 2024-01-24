package demo_002;



import java.util.HashMap;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Post_001 
{
	@Test
	public void Test_1()
	{
		
		HashMap hm=new HashMap();
		hm.put("name", "Devashish");
		hm.put("job", "Trainer");
		RestAssured.given().contentType("Application/json").body(hm)
		.when().post("https://reqres.in/api/users").then().log().all();
		
//		JSONObject j1 = new JSONObject();
//		j1.put("name", "Ram");
//		j1.put("job", "Tester");
//		RestAssured.given().baseUri("https://reqres.in/api/users")
//		.header("Content-Type" ,"Application/json")
//		.contentType(ContentType.JSON)
//		.body(j1.toJSONString())
//		.when().post()
//		.then().log().all();
		
		
	}

}
