package Extra_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json_comparison {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String json1 = "{\r\n"
				+ "  \"name\" : \"Priya\",\r\n"
				+ "  \"job\" : \"QA\",\r\n"
				+ "  \"id\" : \"50\",\r\n"
				+ "  \"skills\" : [ \"Manual testing\", \"Automation testing\" ]\r\n"
				+ "}";
		String json2 = "{\r\n"
				+ "  \"name\" : \"Priya\",\r\n"
				+ "  \"job\" : \"QA\",\r\n"
				+ "  \"id\" : \"55\",\r\n"
				+ "  \"skills\" : [ \"Manual testing\", \"Automation testing\" ]\r\n"
				+ "}";
		ObjectMapper mapper = new ObjectMapper();
	JsonNode node1	= mapper.readTree(json1);
	JsonNode node2 = mapper.readTree(json2);
	System.out.println(node1.equals(node2));

	}

}
