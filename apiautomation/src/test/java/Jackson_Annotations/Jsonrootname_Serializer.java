package Jackson_Annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Jsonrootname_Serializer {

	public static void main(String[] args) throws JsonProcessingException {
		Jsonrootname_pojo serializer = new Jsonrootname_pojo();
		serializer.setName("Raghav");
		serializer.setId(02);
		ObjectMapper mapper = new ObjectMapper();
		//mapping root value to the json
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
	    String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serializer);
	    System.out.println(json);
	}

}
