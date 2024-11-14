package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class bearer_token {
    @Test
	public void bearertoken() {
		RestAssured.given().baseUri("https://api.github.com/user/repos")
		.header("Authorization", "Bearer ghp")
		.when().get().prettyPrint();
	}
}
