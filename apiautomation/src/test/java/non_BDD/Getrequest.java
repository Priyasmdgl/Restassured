package non_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getrequest {
@Test
public void getemployees() {
	RestAssured.baseURI="https://reqres.in";
	RequestSpecification requestSpecification = RestAssured.given();
	Response response = requestSpecification.request(Method.GET,"/api/users?page=2");
	System.out.println(response.asPrettyString());// prints in a well defined string format
	System.out.println(response.getStatusLine());//prints all the response related to the request
	
}
}
