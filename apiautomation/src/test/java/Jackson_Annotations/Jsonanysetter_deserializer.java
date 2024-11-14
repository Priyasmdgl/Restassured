package Jackson_Annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonanysetter_deserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String json = "{\r\n"
				+ "  \"name\" : \"Priya\",\r\n"
				+ "  \"job\" : \"QA\",\r\n"
				+ "  \"id\" : \"55\",\r\n"
				+ "  \"skills\" : [ \"Manual testing\", \"Automation testing\" ]\r\n"
				+ "}";
		ObjectMapper mapper= new ObjectMapper();
	Jsonanysetter_pojo pojo =	mapper.readValue(json, Jsonanysetter_pojo.class);
	System.out.println(pojo.getEmployees());

	}

}
