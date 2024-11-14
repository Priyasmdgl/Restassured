package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Basic_auth {
    @Test
	public void basicauth() {
		RestAssured.given().baseUri("https://postman-echo.com/").auth().basic("postman", "password").when().get("basic-auth").prettyPrint();
		
	}
}
