package Extra_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Serialization {
    @Test
	public void serialization() {
		Map<String, Object> jsonbody = new HashMap<String, Object>();
		List<String> skills = new ArrayList<String>();
		skills.add("Java");
		skills.add("Python");
		
		jsonbody.put("name", "Raghav");
		jsonbody.put("job", "Developer");
		jsonbody.put("id", 100);
		jsonbody.put("Skills", skills);
		System.out.println(jsonbody);
		
		RestAssured.given().baseUri("https://reqres.in").headers("Content-Type","application/json").body(jsonbody).log().all().when().post("/api/users").prettyPrint();
		
	}
}
