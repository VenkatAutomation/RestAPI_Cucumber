package stepdefinations;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.JSONObject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.restassured.http.ContentType;

public class Functional_Library 
{
	@Given("^send Get request$")
	public void send_Get_request() 
	{
	    given()
	    	.contentType(ContentType.JSON)
	    	
	    	.when()
	    	.get("http://localhost:3000/data")
	    	
	    	.then()
	    	.statusCode(200)
	    	.log().all();
	}

	@And("^send Post request$")
	public void send_Post_request() 
	{
		JSONObject data = new JSONObject();
		data.put("name", "Deepika");
		data.put("location", "Suraram");
		data.put("role", "Automation Test Engineer");
		String coursesarr[] = {"Selenium","Manual"};
		data.put("courses", coursesarr);
		
		given()
			.contentType("application/json")
			.body(data.toString())
			
			.when()
			.post("http://localhost:3000/data")
			
			.then()
			.statusCode(201)
			.body("name",equalTo("Deepika"))
			.body("location",equalTo("Suraram"))
			.body("role",equalTo("Automation Test Engineer"))
			.body("courses[0]",equalTo("Selenium"))
			.body("courses[1]",equalTo("Manual"))
			.log().all();
		
	}

	@And("^send Put request$")
	public void send_Put_request() 
	{
		HashMap<String,Object> hm = new HashMap<String, Object>();
		hm.put("name","Deepika");
		hm.put("location","Suraram");
		hm.put("role","Automation Rest API Tester");
		String[] coursesarr = {"Rest Assured","Selenium with Java"};
		hm.put("courses",coursesarr);
		
		given()
			.contentType(ContentType.JSON)
			.body(hm)
			
			.when()
			.put("http://localhost:3000/data/6")
			
			.then()
			.statusCode(200)
			.body("name",equalTo("Deepika"))
			.body("location",equalTo("Suraram"))
			.body("role",equalTo("Automation Rest API Tester"))
			.body("courses[0]",equalTo("Rest Assured"))
			.body("courses[1]",equalTo("Selenium with Java"))
			.log().all();
	}

	@And("^send Delete request$")
	public void send_Delete_request() 
	{
		given()
			.contentType("application/json")
			
			.when()
			.delete("http://localhost:3000/data/6")
			
			.then()
			.statusCode(200)
			.log().all();
	}
}
