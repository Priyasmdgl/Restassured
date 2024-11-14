package BDD;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Request_builder {
	public static void main(String[] args) {
		RequestSpecBuilder builder = new RequestSpecBuilder();
		RequestSpecification specification = builder.setBaseUri("https://reqres.in").setBasePath("/api/users").build();
		RestAssured
		.given()
		 .spec(specification)
		.when()
		   .get("/2").prettyPrint();
	}
	
	
}
