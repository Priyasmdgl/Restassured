package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Getrequest {
    @Test
	public void get() {
		RestAssured
		.given()
		   .baseUri("https://reqres.in")
		.when()
		   .get("/api/users?page=2").prettyPrint();
	}
}
