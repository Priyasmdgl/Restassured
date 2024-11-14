package Extra_concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class gettersetter_serializedeserialize {
	ObjectMapper mapper = new ObjectMapper();
	String json;
	
	public void serializer() throws JsonProcessingException {
		gettersetter serializer = new gettersetter();
		serializer.setName("Raghav");
		serializer.setJob("Developer");
		serializer.setId("25");
		serializer.setSkills(Arrays.asList("Python","java"));
		
	    json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serializer);
		System.out.println(json);
	}
	
	public void deserializer() throws JsonMappingException, JsonProcessingException {
		gettersetter deserializer = mapper.readValue(json,gettersetter.class);
		System.out.println(deserializer.getName());
		System.out.println(deserializer.getJob());
		System.out.println(deserializer.getId());
		System.out.println(deserializer.getSkills());
	}

	public static void main(String[] args) throws JsonProcessingException {
		gettersetter_serializedeserialize relation = new gettersetter_serializedeserialize();
		relation.serializer();
		relation.deserializer();

	}

}
