package non_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getsingle_request {
    @Test
	public void single() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET,"/api/users/2");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}
}
