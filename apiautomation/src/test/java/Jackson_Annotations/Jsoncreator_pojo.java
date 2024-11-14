package Jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Jsoncreator_pojo {
	private String name;
	private int id;
	@JsonCreator
	//constructor instead of setter method
	public Jsoncreator_pojo(@JsonProperty("employeename")String name, @JsonProperty("employeeid") int id) {
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
}
