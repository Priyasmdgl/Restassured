package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class bearer_token {
    @Test
	public void bearertoken() {
		RestAssured.given().baseUri("https://api.github.com/user/repos")
		.header("Authorization", "Bearer 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")
		.when().get().prettyPrint();
	}
}
