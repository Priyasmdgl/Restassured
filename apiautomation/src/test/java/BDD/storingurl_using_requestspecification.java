package BDD;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class storingurl_using_requestspecification {

	RequestSpecification specification;
	@BeforeTest
	public void specification() {
		specification = RestAssured.given().baseUri("https://reqres.in").basePath("/api/users");
		
	}
	@Test
	public void get() {
		RestAssured
		.given()
		   .spec(specification)
		.when()
		   .get("/?page=2").prettyPrint();
	}
	@Test
	public void post() {
		RestAssured.given().baseUri("https://reqres.in").header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\",\r\n"
				+ "    \"id\": \"68\",\r\n"
				+ "    \"createdAt\": \"2024-10-30T07:50:24.785Z\"\r\n"
				+ "}").when().post().prettyPrint();
	}
}
