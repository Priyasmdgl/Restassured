package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Oauth {
    @Test
	public void oauth() {
		RestAssured.given().baseUri("https://api.github.com/user/repos")
		.auth().oauth2("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")
		.when().get().prettyPrint();
	}
}
