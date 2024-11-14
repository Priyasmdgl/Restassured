package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Putrequest {
    @Test
	public void put() {
		RestAssured.given().baseUri("https://reqres.in").header("Content-Type","application/json").body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}").when().put("/api/users/2").prettyPrint();
	}
}
