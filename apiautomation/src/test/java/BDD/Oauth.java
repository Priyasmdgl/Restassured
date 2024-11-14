package BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Oauth {
    @Test
	public void oauth() {
		RestAssured.given().baseUri("https://api.github.com/user/repos")
		.auth().oauth2("ghp")
		.when().get().prettyPrint();
	}
}
