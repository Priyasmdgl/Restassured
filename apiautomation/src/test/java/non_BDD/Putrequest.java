package non_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putrequest {
	@Test
public void put() {
	RestAssured.baseURI="https://reqres.in";
	RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}");
	Response response = requestSpecification.request(Method.PUT,"/api/users/2");
	System.out.println(response.asPrettyString());
	System.out.println(response.statusLine());
}
}
