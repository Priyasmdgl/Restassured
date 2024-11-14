package Extra_concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJO_Serialization {
    
	public static void main(String[] args) throws JsonProcessingException {
		//creating object for pojo class
		Pojo pojoex = new Pojo();
		pojoex.setName("Priya");
		pojoex.setJob("QA");
		pojoex.setId("55");
		pojoex.setSkills(Arrays.asList("Manual testing","Automation testing"));
		System.out.println(pojoex.getName());
		System.out.println(pojoex.getJob());
		System.out.println(pojoex.getId());
		System.out.println(pojoex.getSkills());
		
		//serializing a pojo class
		ObjectMapper mapper = new ObjectMapper();
	    String Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojoex);
	    System.out.println(Json);
		
	}
	
}
