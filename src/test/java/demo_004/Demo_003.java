package demo_004;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojos.Pojo_class_1;

public class Demo_003 
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
		
		RestAssured.given().baseUri("https://reqres.in/api/users")
		.contentType(ContentType.JSON)
		.body(jsonObj)
		.when().post()
		.then().statusCode(201).log().all();
		
		
		//Deserialization
		// covert json object  into java Object is called Serialization
		// in deseralization Default constructer is called
		 Pojo_class_1 javaObj = obj.readValue(jsonObj, Pojo_class_1.class);
		 javaObj.getName();
		 System.out.println("--------------------------------------------------------");
		 System.out.println(javaObj.getName());
		
		
		
		
		
	}
	
}
