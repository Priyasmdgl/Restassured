package Extra_concepts;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class Jsonpathfinder {
	
	public static void json() throws IOException {
		InputStream json = new FileInputStream("src/test/resources/bookstore.json");
	Object parsing=	Configuration.defaultConfiguration().jsonProvider().parse(json.readAllBytes());
	List<Object> price = JsonPath.read(parsing, "$..Price");
	List<Object> year = JsonPath.read(parsing, "$..Year");
	for (Object object : price) {
		System.out.println(price);
	}
	for (Object object : year) {
		System.out.println(year);
	}
	}

	public static void main(String[] args) throws IOException {
		json();

	}

}
