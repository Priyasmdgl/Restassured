package Jackson_Annotations;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonanygetter_serializer {

	public static void main(String[] args) throws JsonProcessingException {
		Jsonanygetter_Pojo serializer = new Jsonanygetter_Pojo();
		
		Map<String, Object> values = new HashMap<String, Object>();
		values.put("name", "Jayanthi");
		values.put("job", "Accountant");
		values.put("id", 50);
		
		serializer.setEmployees(values);
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serializer);
		System.out.println(json);
	}
}
