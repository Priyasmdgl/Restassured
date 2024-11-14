package Extra_concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class validation_using_networknt {

	@Test
	public void validation() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V201909);
		File json = new File("src/test/resources/input.json");
		InputStream schema = new FileInputStream("src/test/resources/schema.json");
		JsonNode node = mapper.readTree(json);
		com.networknt.schema.JsonSchema Schema = factory.getSchema(schema);
		Set <ValidationMessage> result =	Schema.validate(node);
		System.out.println(result);
	}
}
