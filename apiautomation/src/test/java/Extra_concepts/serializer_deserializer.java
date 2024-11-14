package Extra_concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class serializer_deserializer {

	public static void main(String[] args) throws JsonProcessingException {
		//serializtion
		Pojo serializer = new Pojo();
		serializer.setName("Raghav");
		serializer.setJob("Developer");
		serializer.setId("25");
		serializer.setSkills(Arrays.asList("Python","java"));
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serializer);
		System.out.println(json);
		//deserialization
		Pojo deserializer = mapper.readValue(json,Pojo.class);
		System.out.println(deserializer.getName());
		System.out.println(deserializer.getJob());
		System.out.println(deserializer.getId());
		System.out.println(deserializer.getSkills());
		
	}

}
