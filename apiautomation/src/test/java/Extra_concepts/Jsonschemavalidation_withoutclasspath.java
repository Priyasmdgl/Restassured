package Extra_concepts;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Jsonschemavalidation_withoutclasspath {

	@Test
	public void validation() {
		File Json = new File("src/test/resources/input.json");
		File schema = new File("src/test/resources/schema.json");
		RestAssured
		.given()
		.baseUri("https://reqres.in")
		.header("Content-Type","application/json")
		.body(Json).when().post("/api/users")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(schema));
	}
}
