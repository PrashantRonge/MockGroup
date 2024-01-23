package demo_003;

import static org.testng.Assert.assertEquals;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Demo_003_responsefullbody 
{
	
	@Test
	public void test1()
	{

//-------------------1st  req --------------------------------------------------------		
		 Response res = RestAssured.given().baseUri("https://reqres.in/api/users?page=2")
		.when().get()
		.then().extract().response();
	     String actualFullBody = res.body().asPrettyString();
	     
	     String Expected = "{\r\n"
	     		+ "    \"page\": 1,\r\n"
	     		+ "    \"per_page\": 6,\r\n"
	     		+ "    \"total\": 12,\r\n"
	     		+ "    \"total_pages\": 2,\r\n"
	     		+ "    \"data\": [\r\n"
	     		+ "        {\r\n"
	     		+ "            \"id\": 1,\r\n"
	     		+ "            \"email\": \"george.bluth@reqres.in\",\r\n"
	     		+ "            \"first_name\": \"George\",\r\n"
	     		+ "            \"last_name\": \"Bluth\",\r\n"
	     		+ "            \"avatar\": \"https://reqres.in/img/faces/1-image.jpg\"\r\n"
	     		+ "        },\r\n"
	     		+ "        {\r\n"
	     		+ "            \"id\": 2,\r\n"
	     		+ "            \"email\": \"janet.weaver@reqres.in\",\r\n"
	     		+ "            \"first_name\": \"Janet\",\r\n"
	     		+ "            \"last_name\": \"Weaver\",\r\n"
	     		+ "            \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n"
	     		+ "        },\r\n"
	     		+ "        {\r\n"
	     		+ "            \"id\": 3,\r\n"
	     		+ "            \"email\": \"emma.wong@reqres.in\",\r\n"
	     		+ "            \"first_name\": \"Emma\",\r\n"
	     		+ "            \"last_name\": \"Wong\",\r\n"
	     		+ "            \"avatar\": \"https://reqres.in/img/faces/3-image.jpg\"\r\n"
	     		+ "        },\r\n"
	     		+ "        {\r\n"
	     		+ "            \"id\": 4,\r\n"
	     		+ "            \"email\": \"eve.holt@reqres.in\",\r\n"
	     		+ "            \"first_name\": \"Eve\",\r\n"
	     		+ "            \"last_name\": \"Holt\",\r\n"
	     		+ "            \"avatar\": \"https://reqres.in/img/faces/4-image.jpg\"\r\n"
	     		+ "        },\r\n"
	     		+ "        {\r\n"
	     		+ "            \"id\": 5,\r\n"
	     		+ "            \"email\": \"charles.morris@reqres.in\",\r\n"
	     		+ "            \"first_name\": \"Charles\",\r\n"
	     		+ "            \"last_name\": \"Morris\",\r\n"
	     		+ "            \"avatar\": \"https://reqres.in/img/faces/5-image.jpg\"\r\n"
	     		+ "        },\r\n"
	     		+ "        {\r\n"
	     		+ "            \"id\": 6,\r\n"
	     		+ "            \"email\": \"tracey.ramos@reqres.in\",\r\n"
	     		+ "            \"first_name\": \"Tracey\",\r\n"
	     		+ "            \"last_name\": \"Ramos\",\r\n"
	     		+ "            \"avatar\": \"https://reqres.in/img/faces/6-image.jpg\"\r\n"
	     		+ "        }\r\n"
	     		+ "    ],\r\n"
	     		+ "    \"support\": {\r\n"
	     		+ "        \"url\": \"https://reqres.in/#support-heading\",\r\n"
	     		+ "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n"
	     		+ "    }\r\n"
	     		+ "}";
		


		
	}

}
