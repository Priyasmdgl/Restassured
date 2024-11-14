package Jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Jsonsetter_pojo {
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	@JsonSetter(value = "employeename")
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
