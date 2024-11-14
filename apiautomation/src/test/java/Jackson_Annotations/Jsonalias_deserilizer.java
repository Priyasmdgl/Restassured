package Jackson_Annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonalias_deserilizer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String json = "{\r\n"
				+ "  \"ID\" : 1,\r\n"
				+ "  \"name\" : \"Priya\"\r\n"
				+ "}";
		ObjectMapper mapper= new ObjectMapper();
	Jsonalias_pojo pojo =	mapper.readValue(json, Jsonalias_pojo.class);
	System.out.println(pojo.getName());
	System.out.println(pojo.getId());

	}

}
