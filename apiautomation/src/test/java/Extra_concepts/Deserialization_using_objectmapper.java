package Extra_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization_using_objectmapper {

	String json = "{\r\n"
			+ "  \"name\" : \"Priya\",\r\n"
			+ "  \"job\" : \"QA\",\r\n"
			+ "  \"id\" : \"55\",\r\n"
			+ "  \"skills\" : [ \"Manual testing\", \"Automation testing\" ]\r\n"
			+ "}";
	
	public void objectmapper() throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Pojo pojo =  mapper.readValue(json, Pojo.class);
		System.out.println(pojo.getName());
		System.out.println(pojo.getJob());
		System.out.println(pojo.getId());
		System.out.println(pojo.getSkills());
		
		
	}
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
      Deserialization_using_objectmapper deserialization = new Deserialization_using_objectmapper();
      deserialization.objectmapper();
	}

}
