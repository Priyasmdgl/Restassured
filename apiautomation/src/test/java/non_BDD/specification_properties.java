package non_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class specification_properties {
    @Test
	public void properties() {
		RestAssured.baseURI=("https://reqres.in");
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\",\r\n"
				+ "    \"id\": \"68\",\r\n"
				+ "    \"createdAt\": \"2024-10-30T07:50:24.785Z\"\r\n"
				+ "}");
		Response response = requestSpecification.request(Method.POST,"/api/users");
		System.out.println(response.asPrettyString());
		QueryableRequestSpecification properties = SpecificationQuerier.query(requestSpecification);
		System.out.println(properties.getHeaders());
		System.out.println(properties.getBaseUri());
		System.out.println(properties.getContentType());
	}
}
