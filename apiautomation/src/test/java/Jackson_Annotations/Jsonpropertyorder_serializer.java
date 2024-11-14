package Jackson_Annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonpropertyorder_serializer {

	public static void main(String[] args) throws JsonProcessingException {
		Jsonpropertyorder_Pojo serializer = new Jsonpropertyorder_Pojo();
		serializer.setName("Raghav");
		serializer.setId(02);
		ObjectMapper mapper = new ObjectMapper();
	    String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serializer);
	    System.out.println(json);

	}

}
