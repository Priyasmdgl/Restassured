package Jackson_Annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsongetter_serializer {

	public static void main(String[] args) throws JsonProcessingException {
		Jsongetter_Pojo serializer = new Jsongetter_Pojo();
		serializer.setName("Priya");
		serializer.setId(01);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serializer);
		System.out.println(json);

	}

}
