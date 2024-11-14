package BDD;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Body_from_externalfile {
    @Test
	public void post() {
		File jsonfFile = new File("body.json");
		RestAssured.given().baseUri("https://reqres.in").header("Content-Type","application/json").body(jsonfFile).when().post("/api/users").prettyPrint();
		
	}
}
