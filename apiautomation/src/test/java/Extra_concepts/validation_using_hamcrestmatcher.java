package Extra_concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class validation_using_hamcrestmatcher {
    @Test
	public void validation() throws IOException {
		File Json = new File("src/test/resources/input.json");
		File schema = new File("src/test/resources/schema.json");
	String json = FileUtils.readFileToString(Json, "UTF-8");
		MatcherAssert.assertThat(json, JsonSchemaValidator.matchesJsonSchema(schema));
	}
}
