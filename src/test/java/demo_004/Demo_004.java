package demo_004;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import pojos.Pojo_class_1;

public class Demo_004 
{

	//POJO == >>plane old java object
	@Test
	public void test_1() throws JsonProcessingException
	{
		
		//Pojo_class_1 p1 = new Pojo_class_1("xyz", "TL"); // java object
		Pojo_class_1 p2 = new Pojo_class_1("abc", "QA"); // java object
		p2.setName("Modi");
		ObjectMapper obj = new ObjectMapper();
		String jsonObj = obj.writerWithDefaultPrettyPrinter().writeValueAsString(p2);
// covert java object  into json Object is called Serialization
		
		Response res1 = RestAssured.given().baseUri("https://reqres.in/api/users")
		.contentType(ContentType.JSON)
		.body(jsonObj)
		.when().post()
		.then().statusCode(201).extract().response();
		System.out.println("==================");
		System.out.println(res1.getTime());
		System.out.println("==================");
		if(res1.getTime()>500)
		{
			
			Assert.fail("Time is Greater than 500ms");
		}
		
		String var2 = res1.path("name");
		
		JSONObject js = new JSONObject();
		js.put("name", var2);
		js.put("job", "Devloper");
		RestAssured.given().baseUri("https://reqres.in/api/users/2")
		.contentType(ContentType.JSON)
		.body(js.toString())
		.when().patch()
		.then().log().all();
		
		
		
		
		
		
		
	}
	
}
