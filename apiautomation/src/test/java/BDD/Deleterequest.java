package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Deleterequest {
    @Test
	public void delete() {
		RestAssured.given().baseUri("https://reqres.in").when().delete("/api/users/2").prettyPrint();
	}
}
