package Jackson_Annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsoncreator_deserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
			String json = "{\r\n"
					+ "  \"employeeid\" : 1,\r\n"
					+ "  \"employeename\" : \"Priya\"\r\n"
					+ "}";
			ObjectMapper mapper= new ObjectMapper();
		Jsoncreator_pojo pojo =	mapper.readValue(json, Jsoncreator_pojo.class);
		System.out.println(pojo.getName());
		System.out.println(pojo.getId());


		}

	}

