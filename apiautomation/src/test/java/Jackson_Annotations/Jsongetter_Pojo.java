package Jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Jsongetter_Pojo {

	private String name;
	private int id;
	@JsonGetter(value = "employeename")
	public String getName() {
		return name;
	}
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
