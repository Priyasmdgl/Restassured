package Extra_concepts;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class Deserialization_using_functions {

	public void functions() {
		Map<String, Object> response = RestAssured.given()
				.baseUri("https://reqres.in")
				.when().get("/api/users/2")
				.then().extract().body().as(new TypeRef <Map<String,Object>>(){
					});
		System.out.println(response);
		System.out.println(response.get("id"));
		}
	public static void main(String[] args) {
		
Deserialization_using_functions deserialization = new Deserialization_using_functions();
deserialization.functions();
	}

}
