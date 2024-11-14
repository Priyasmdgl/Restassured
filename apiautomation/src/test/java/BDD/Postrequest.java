package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Postrequest {
    @Test
	public void post() {
		RestAssured.given().baseUri("https://reqres.in").header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\",\r\n"
				+ "    \"id\": \"68\",\r\n"
				+ "    \"createdAt\": \"2024-10-30T07:50:24.785Z\"\r\n"
				+ "}").when().post("/api/users").prettyPrint();
	}
}
